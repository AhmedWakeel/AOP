package com.aop.latest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {

	public static void main(String[] args)
	{
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("newAop.xml");
		ShapeService bean = applicationContext.getBean("shapeService", ShapeService.class);
		new Circle().setName("small");
		bean.getCircle().setName("dfjfj");
//		System.out.println(bean.getCircle().getName());
		((AbstractApplicationContext)applicationContext).close();
	}
}
