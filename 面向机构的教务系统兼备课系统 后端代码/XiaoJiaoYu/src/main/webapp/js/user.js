var getUrlParameter = function getUrlParameter(sParam) {
  var sPageURL = window.location.search.substring(1),
      sURLVariables = sPageURL.split('&'),
      sParameterName,
      i;

  for (i = 0; i < sURLVariables.length; i++) {
    var str = sURLVariables[i];
    if (str.indexOf('=') == -1)
      continue;

    sParameterName = str.substr(0, str.indexOf('='));
    if (sParameterName === sParam) {
      return decodeURIComponent(str.substr(str.indexOf('=') + 1));
    }
  }
};


var User = function(name) {
}

User.prototype.show_error = function(action, msg) {
  new PNotify({
    title: '出错啦',
    text: msg,
    type: 'error',
    delay: 6000
  });
}

User.prototype.bind_events = function() {
  var that = this;
  $('#signin-btn').click(function() {
    that.signin();
  });

  $('#signin-password').keypress(function (e) {
    var key = e.which;
    // the enter key code
    if (key == 13) {
      $('#signin-btn').click();
      return false;
    }
  });

  $('#verify-btn').click(function() {
    that.verify();
  });

  $('#forget-btn').click(function() {
    if (!that.nc_validate) {
      that.show_error('signin', '请先完成验证码验证');
      return;
    }

    that.forget();
  });

  $('#reset-password-btn').click(function() {
    that.reset_password();
  });

  $('#change-phone-btn').click(function() {
    if ($(this).attr('disabled') == 'disabled') {
      return;
    }

    that.change_phone();
  });

  $('#can-not-receive-btn').click(function() {
    that.post('/user/forget_password/tts', {}, function(result) {
      if (!result.success) {
        that.show_error('forget', result.msg);
        return
      }
      new PNotify({
        title: '发送成功',
        text: '语音验证码发送成功，请注意收听。',
        type: 'success',
        delay: 3000
      });
    })
  });
}

User.prototype.post = function(url, data, done) {
  var that = this;
  $.ajax({
    url: url,
    type: "POST",
    data: JSON.stringify(data),
    contentType: "application/json; charset=utf-8",
    dataType: "json"
  }).done(function(result) {
    done(result);
  }).fail(function(result) {
    if (result.status == 429) {
      that.show_error("", "请求频率过高，请稍后再尝试");
      return;
    }

    new PNotify({
      title: '网络错误',
      text: '请求失败，请稍后重试',
      type: 'error',
      delay: 5000
    });
  });
}

User.prototype.signin = function() {
  if (this.should_pass_captcha == true && !this.nc_validate) {
    this.show_error("", "请先完成验证码验证");
    return;
  }

  var that = this;
  var username = $('#signin-username').val();
  var password = $('#signin-password').val();
  var remember_me = $('#signin-remember-me').is(":checked");
  var phone = username;
  var data = {
    username: username,
    phone: phone,
    password: password,
    remember_me: remember_me,
    nc_validate: that.nc_validate,
    next: getUrlParameter('next')
  };

  this.post('/user/signin', data, function(result) {
    if (!result.success) {
      that.show_error('signin', result.msg);
      if (result.should_pass_captcha == true) {
        that.should_pass_captcha = true;
        $('#captcha-div').show();
        that.init_aliyun_nc();
      }
      return;
    }

    location.href = result.next;
  });
}

User.prototype.verify = function() {
  var that = this;
  var code = $('#verify-code').val();
  var next = getUrlParameter('next');
  this.post('/user/verify', {code: code}, function(result) {
    if (!result.success) {
      that.show_error('verify', result.msg);
      return;
    }

    if (next) {
      if (next.length > 1 && next[0] != '/')
        next = '/' + next
      location.href = next;
    } else {
      window.location.reload();
    }
  });
}

User.prototype.init_aliyun_nc = function() {
  var that = this;
  that.nc_validate = null;
  that.nc = new noCaptcha();

  var nc_appkey = 'FFFF000000000176CAD2';  // 应用标识,不可更改
  var nc_scene = 'login';  //场景,不可更改
  var nc_token = [nc_appkey, (new Date()).getTime(), Math.random()].join(':');
  var nc_option = {
    renderTo: '#aliyun-nc-captcha',//渲染到该DOM ID指定的Div位置
    appkey: nc_appkey,
    scene: nc_scene,
    token: nc_token,
    callback: function (data) {// 校验成功回调
      that.nc_validate = {
        csessionid: data.csessionid,
        sig: data.sig,
        token: nc_token,
        scene: nc_scene
      }
    }
  };
  that.nc.init(nc_option);
}

User.prototype.forget = function() {
  if (this.state == 'forget_password_reset') {
    this.forget_password_reset();
    return;
  }

  var that = this;
  if (!this.nc_validate) {
    this.show_error("", "请先完成验证码验证");
    return;
  }

  var phone = $('#forget-phone').val();
  if (phone.length != 11) {
    $('#forget-phone').focus();
    that.show_error("", "请输入合法的手机号码");
    return;
  }

  var data = {
    phone: phone,
    nc_validate: that.nc_validate,
  };
  this.post(location.pathname, data, function(result) {
    if (!result.success) {
      that.show_error('forget', result.msg);
      that.init_aliyun_nc();
      return;
    }

    $('#new-password-input-group').fadeIn();
    $('#captcha-div').hide();
    new PNotify({
      title: '发送成功',
      text: '短信验证码发送成功，请查收。',
      type: 'success',
      delay: 3000
    });
    $('#forget-btn').text('提交');
    $('#can-not-receive-btn').fadeIn();
    that.state = 'forget_password_reset';
    $('#forget-phone').prop("readonly", true);
  });
}

User.prototype.is_valid_password = function(password, is_new) {
  if (!/^[\x21-\x7E]{6,}$/.test(password)) {
    if (is_new) {
      this.show_error('', '您输入的新密码不符合要求：长度最短为6，允许使用大小写字母，数字和以下特殊字符');
    } else {
      this.show_error('', '您输入的密码不符合要求：长度最短为6，允许使用大小写字母，数字和以下特殊字符');
    }
    return false
  }

  return true;
}

User.prototype.forget_password_reset = function() {
  var that = this;
  var phone = $('#forget-phone').val();
  var password = $('#forget-password').val();
  if (password != $('#forget-confirm-password').val()) {
    this.show_error('forget', '您两次输入的密码不一致');
    return;
  }
  if (!this.is_valid_password(password)) {
    return;
  }

  var code = $('#verify-code').val();
  var data = {
    phone: phone,
    code: code,
    password: password
  }
  this.post('/user/forget_password/reset', data, function(result) {
    if (!result.success) {
      that.show_error('forget', result.msg);
      return;
    }

    $('#forget-group').html('<a href="javascript: history.go(-1)">你的密码已设置成功，点击返回登录界面</a><br/><br/><br/>');
    $('#can-not-receive-btn').fadeOut();
  });
}


User.prototype.reset_password = function() {
  var that = this;
  var old_password = $('#old-password').val();
  var new_password = $('#new-password').val();
  var confirm_new_password = $('#confirm-new-password').val();
  if (new_password != confirm_new_password) {
    this.show_error('reset', '您两次输入的密码不一致');
    return;
  }

  if (!this.is_valid_password(new_password, true)) {
    return;
  }

  var data = {old_password: old_password, password: new_password};
  this.post(location.pathname, data, function(result) {
    if (!result.success) {
      that.show_error('reset', result.msg);
      return;
    }

    alert("你的密码已重置，请重新登录");
    var next = getUrlParameter('next');
    if (next != undefined) {
      var lnext = next.toLowerCase();
      if (lnext.startsWith('http://') || lnext.startsWith('https://') ||
          lnext.startsWith('/')) {
        window.location.href = next;
        return;
      }
    }

    window.location.href = '/user';
  });
}

User.prototype.change_phone = function() {
  var that = this;
  if (that.state == 'change_phone_via_code') {
    var code = $('#verify-code').val()
    this.post(location.pathname + '/' + code, {}, function(result) {
      if (!result.success) {
        that.show_error('change_phone', result.msg);
        return;
      }

      $('#change-phone-btn').attr('disabled', 'disabled');
      new PNotify({
        title: '修改成功',
        text: '您账号绑定的手机号已经修改成功',
        type: 'success',
        delay: 3000
      });

      setTimeout(function () {
        window.onbeforeunload = null;
        window.location.reload();
      }, 3000);
    });
    return;
  }

  var phone = $('#change-phone').val();
  var data = {phone: phone};
  this.post(location.pathname, data, function(result) {
    if (!result.success) {
      that.show_error('change_phone', result.msg);
      return;
    }

    $('#change-phone-input-group').fadeIn();
    new PNotify({
      title: '发送成功',
      text: '短信验证码发送成功，请查收。',
      type: 'success',
      delay: 3000
    });
    $('#change-phone-btn').text('提交');
    that.state = 'change_phone_via_code';
    $('#change-phone').prop("readonly", true);

    window.onbeforeunload = function(e) {
      e = e || window.event;
      // For IE and Firefox prior to version 4
      if (e) {
        e.returnValue = '确认退出？';
      }

      // For Safari
      return '确认退出?';
    }
  });
}

function init_password_strength_info(id) {
  $(id).keyup(function (e) {
    var tishi =$("<div '>"
            +"<div style='float: left;width: 70px;;height: 15px;margin: 0 3px;'>安全程度：</div>"
            +"<div id='threeBlock'><div class='level' style='float: left;background-color: Gray;width: 30px;height: 15px;margin: 0 3px;'></div>"
            +"<div class='level' style='float: left;background-color: Gray;width: 30px;height: 15px;margin: 0 3px;'></div>"
            +"<div class='level' style='float: left;background-color: Gray;width: 30px;height: 15px;margin: 0 3px;'></div></div>"
            +"<span id='passstrength'></span>"
            +"</div>"
            +"<div style='float: left'>"
            +"<ul style='padding-left: 20px;list-style: square;'>"
            +"<li>长度最少6位</li>"
            +"<li>只能包含大小写字母,数字以及标点符号(除空格)</li>"
            +"<li>至少含有一个字母，一个数字</li>"
            +"</ul>"
            +"</div>");
    var $passstrength = tishi.find('#passstrength');
    var strongRegex = /^(?=\S*?[A-Z])(?=\S*?[a-z])(?=\S*?[0-9])(?=\S*?[^\w\*])\S{6,}$/;
    var mediumRegex = new RegExp("^(?=.{7,})(((?=.*[A-Z])(?=.*[a-z]))|((?=.*[A-Z])(?=.*[0-9]))|((?=.*[a-z])(?=.*[0-9]))).*$", "g");
    var enoughRegex = new RegExp("(?=.{6,}).*", "g");
    if (false == enoughRegex.test($(this).val())) {
      $passstrength.html('位数不够');
      tishi.find("#threeBlock .level:lt(3)").css("background-color","Gray");
    } else if (strongRegex.test($(this).val())) {
      $passstrength.html('强!');
      tishi.find("#threeBlock .level:lt(3)").css("background-color","Green");
    } else if (mediumRegex.test($(this).val())) {
      $passstrength.html('中!');
      tishi.find("#threeBlock .level:lt(2)").css("background-color","Green");
      tishi.find("#threeBlock .level:gt(1)").css("background-color","Gray");
    } else {
      $passstrength.html('弱!');
      tishi.find("#threeBlock .level:lt(1)").css("background-color","#B2E0FF");
      tishi.find("#threeBlock .level:gt(0)").css("background-color","Gray");
    }

    $(this).popover('destroy').popover({
      trigger : 'hover',
      html : true,
      placement : 'right',
      container : 'body',
      content : tishi
    }).popover('show');
  });
}

$(function () {
  var user = new User()
  user.bind_events();

  if (window.INIT_ALIYUN_NC) {
    user.init_aliyun_nc();
  }

  // Enable placeholder behavior for IE9
  if (!('placeholder' in document.createElement('input'))) {
    $.getScript('https://cdn.staticfile.org/jquery-placeholder/2.3.1/jquery.placeholder.min.js', function() {
      $('input, textarea').placeholder();  
    });
  }

  init_password_strength_info('#new-password');
  init_password_strength_info('#forget-password');
});
