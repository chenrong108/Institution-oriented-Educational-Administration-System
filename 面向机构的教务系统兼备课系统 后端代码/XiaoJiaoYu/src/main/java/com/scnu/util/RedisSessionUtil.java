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
	
	// ˫������������
	public static RedisSessionUtil getInstance() {
	if(instance == null) {
		synchronized(RedisSessionUtil.class) {
			if(instance == null) {
				instance = new RedisSessionUtil();
				// ��֤���ӳ�Ҳֻ�ǳ�ʼ��һ��
				instance.init();
			}
		}
	}
	    return instance;
	}

	// ���ù���ʱ��Ϊ33��, 2��ʱ����ӳ�
    private final int expire = 35;
    
    private static String path = "47.112.3.164";

    private static int port = 6379;

	private JedisPool pool;
	
	
	// ��粻��ʵ���� RedisSessionUtil
	private RedisSessionUtil(){

	}
	
	// Jedis���ӳس�ʼ��
	public void init() {
		JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
		jedisPoolConfig.setMaxTotal(10);
		pool = new JedisPool(jedisPoolConfig, path, port);
		//System.out.println("���ӳس�ʼ���ɹ�");
	}
	
	// �ر����ӳ�
	public void end() {
		if(null != pool) {
			pool.destroy();
		//	System.out.println("���ӳعر�");
		}
	}
	
	// ��1�����ݿ� ����session����Чֵ��ֻ����������⣬��ͬ��tomcat��session��Чֵ
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
	
	// ��ȡsession��ֵ�������ߵ�����
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
	
	// ����key����value
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
	
	// �õ���
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
	
	// �յ�¼�û���¼ , ����2�����ݿ�
	public void addByDay(HttpSession session) {
		Jedis jedis = null;
        String str = getDay();
		// str = 2019514 2019��5��14�� key
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
	
	// ��ȡ���� ��¼������
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
	
	
	// �µ�¼�û���¼ �� ����2�����ݿ�
	public void addByMonth(HttpSession session) {
		Jedis jedis = null;
		String str = getMonth();
		// str = 20195   2019��5��   key
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
	
	// ��ȡ���µĵ�¼����
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