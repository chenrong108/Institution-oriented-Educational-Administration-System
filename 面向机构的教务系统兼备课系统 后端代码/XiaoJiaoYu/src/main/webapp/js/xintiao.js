   var localObj = window.location;

   var basePath = localObj.protocol+"//"+localObj.host;

   var server_context=basePath;  // 获取服务器的地址   

/*var func = function(){
	 $.ajax({
		 	type:"post",
		 	url: server_context + "/user/online",
		 	async:true,
		 });
	 return func;
 }

setInterval(func(), 33000);*/