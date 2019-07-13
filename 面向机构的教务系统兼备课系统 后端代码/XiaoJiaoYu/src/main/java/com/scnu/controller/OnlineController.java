package com.scnu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.scnu.bean.Online;
import com.scnu.util.RedisSessionUtil;

@Controller
@RequestMapping("/data")
public class OnlineController {
	
	RedisSessionUtil instance = RedisSessionUtil.getInstance();
	
	@RequestMapping(value = "/getCount", method = RequestMethod.POST)
	@ResponseBody
	public Online getCount() {
		//System.out.println("A");
		Online obj = new Online();
		obj.setOnlineCount(instance.getKeysSize());
		obj.setDayCount(instance.getDayCount());
		obj.setMonthCount(instance.getMonthCount());
		return obj;
	}

}
