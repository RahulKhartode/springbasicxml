package com.poc.springbasicxml.post;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class DummyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("In Bean Factory Post Processor");
		String beanDefs[] = beanFactory.getBeanDefinitionNames();
		for (String beanDef : beanDefs) {
			System.out.println("Bean Defn "+beanDef);
		}
		
	}

}
