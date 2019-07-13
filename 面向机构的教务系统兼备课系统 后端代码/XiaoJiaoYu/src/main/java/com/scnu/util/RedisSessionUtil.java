package com.scnu.util;

import java.text.DateFormat;
import java.util.Date;
import java.util.Set;

import javax.servlet.http.HttpSession;

import com.scnu.bean.UserInfo;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
public class RedisSessionUtil {
	
	private static RedisSessionUtil instance;
	
	// 双重锁创建单例
	public static RedisSessionUtil getInstance() {
	if(instance == null) {
		synchronized(RedisSessionUtil.class) {
			if(instance == null) {
				instance = new RedisSessionUtil();
				// 保证连接池也只是初始化一次
				instance.init();
			}
		}
	}
	    return instance;
	}

	// 设置过期时间为33秒, 2秒时间的延迟
    private final int expire = 35;
    
    private static String path = "47.112.3.164";

    private static int port = 6379;

	private JedisPool pool;
	
	
	// 外界不能实例化 RedisSessionUtil
	private RedisSessionUtil(){

	}
	
	// Jedis连接池初始化
	public void init() {
		JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
		jedisPoolConfig.setMaxTotal(10);
		pool = new JedisPool(jedisPoolConfig, path, port);
		//System.out.println("连接池初始化成功");
	}
	
	// 关闭连接池
	public void end() {
		if(null != pool) {
			pool.destroy();
		//	System.out.println("连接池关闭");
		}
	}
	
	// 在1号数据库 更新session的有效值，只用于心跳检测，不同于tomcat的session有效值
	public void updateExpire(String userId , String realName) {
		
		Jedis jedis = null;
		try {
		//System.out.println("Redis : " + session.getId());
		jedis = pool.getResource();
		jedis.select(1);
		//System.out.println("realName = " + realName);
		jedis.set(userId, realName);
		jedis.expire(userId, expire);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(jedis != null)
		      jedis.close();
		}
		
	}
	
	// 获取session的值，即在线的人数
	public int getKeysSize() {
		
		Jedis jedis = null;
		Set<String> set = null;
		try {
		jedis = pool.getResource();
		jedis.select(1);
		set = jedis.keys("*");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(jedis != null)
			jedis.close();
		}
		
		if(set == null ) return 0;
		else return set.size();
		
	}
	
	// 根据key返回value
	public String getKey(String key) {
		
		Jedis jedis = null;
		String str = null;
		try {
			jedis = pool.getResource();
			jedis.select(1);
			str = jedis.get(key);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(jedis != null)
			 jedis.close();
		}
		
		return str;
	}
	
	// 得到日
	public String getDay() {
		Date date = new Date();
		String str = null;
		
		str = DateFormat.getDateInstance().format(date);
		String[] arr = str.split("-");
		StringBuffer sbf = new StringBuffer("");
		for(String s : arr) {
			sbf.append(s);
		}

		return sbf.toString();
	}
	
	public String getMonth() {
		Date date = new Date();
		String str = null;
		
		str = DateFormat.getDateInstance().format(date);
		String[] arr = str.split("-");
		StringBuffer sbf = new StringBuffer("");
		for(int i = 0; i < 2; i++) {
			sbf.append(arr[i]);
		}

		return sbf.toString();
	}
	
	// 日登录用户记录 , 存在2号数据库
	public void addByDay(HttpSession session) {
		Jedis jedis = null;
        String str = getDay();
		// str = 2019514 2019年5月14日 key
		try {
			jedis = pool.getResource();
			jedis.select(2);
			jedis.sadd(str, session.getId());
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(jedis != null)
				jedis.close();
		}
	}
	
	// 获取当日 登录的人数
	public int getDayCount() {
		
		Jedis jedis = null;
		String str = getDay();
		Set<String> set = null;
		try {
			jedis = pool.getResource();
			jedis.select(2);
			set = jedis.smembers(str);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(jedis != null)
			jedis.close();
		}
		
		if(set == null) return 0;
		else return set.size();
		
	}
	
	
	// 月登录用户记录 ， 存在2号数据库
	public void addByMonth(HttpSession session) {
		Jedis jedis = null;
		String str = getMonth();
		// str = 20195   2019年5月   key
		try {
			jedis = pool.getResource();
			jedis.select(2);
			jedis.sadd(str, session.getId());
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(jedis != null)
				jedis.close();
		}
	}
	
	// 获取当月的登录人数
	public int getMonthCount() {
		Jedis jedis = null;
		String str = getMonth();
		Set<String> set = null;
		try {
			jedis = pool.getResource();
			jedis.select(2);
			set = jedis.smembers(str);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(jedis != null)
				jedis.close();
		}
		
		if(set == null) return 0;
		else return set.size();
	}
		
}