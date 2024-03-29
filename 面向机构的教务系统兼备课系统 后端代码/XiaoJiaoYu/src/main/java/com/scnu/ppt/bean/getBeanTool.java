package com.scnu.ppt.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class getBeanTool implements ApplicationContextAware {
	
	private static ApplicationContext applicationContext = null;

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		getBeanTool.applicationContext = applicationContext;
	}
	
	public static Object getBeanByName(String beanName) {
        if (applicationContext == null){
            return null;
        }
        return applicationContext.getBean(beanName);
        
    }

    public static <T> T getBean(Class<T> type) {
        return applicationContext.getBean(type);
        
    }

}
