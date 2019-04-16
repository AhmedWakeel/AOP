package com.aop.latest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {

	public static void main(String[] args)
	{
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("newAop.xml");
		ShapeService bean = applicationContext.getBean("shapeService", ShapeService.class);
		System.out.println(bean.getCircle().getName());
		
	}
}
