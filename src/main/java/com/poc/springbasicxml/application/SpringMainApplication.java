package com.poc.springbasicxml.application;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.poc.springbasicxml.dto.FirmDTO;
import com.poc.springbasicxml.service.FirmService;

public class SpringMainApplication {

	public static void main(String[] args) {
		FirmService firmService;
		List<FirmDTO> firmDTOs;
		
//		Resource resource = new ClassPathResource("spring-config.xml");
//		BeanFactory beanFactory = new XmlBeanFactory(resource);
//		firmService = beanFactory.getBean("firmService", FirmService.class);
		
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
		firmService = applicationContext.getBean("firmService", FirmService.class);
		System.out.println("Class name : "+firmService);
		
		firmDTOs = firmService.findAll();
		for (FirmDTO firmDTO : firmDTOs) {
			System.out.println(firmDTO.getFirmMPID());
		}
		
		applicationContext.close();
	}

}
