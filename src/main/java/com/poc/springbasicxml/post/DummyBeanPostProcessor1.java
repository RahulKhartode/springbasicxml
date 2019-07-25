package com.poc.springbasicxml.post;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class DummyBeanPostProcessor1 implements BeanPostProcessor, Ordered {

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("DummyBeanPostProcessor1 - Before Initializing bean "+beanName);
		return bean;
	}
	
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("DummyBeanPostProcessor1 - After Initializing bean "+beanName);
		return bean;
	}

	public int getOrder() {
		return 1;
	}
}
