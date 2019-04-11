package com.spring.aop.copy.usingxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAop {
	
	public static void main(String[] args)
	{
	
	ApplicationContext ctx=new ClassPathXmlApplicationContext("Springaop.xml");
    
	 ShapeService shapeService=ctx.getBean("shapeservice",ShapeService.class);
//	     shapeService.getCircle().setName("big Circle");
	 shapeService.getCircle();
//	     System.out.println("circle ne is "+shapeService.getCircle().getName()); 
	     
	     
//     System.out.println(shapeService.getCircle(). getName());	
//     System.out.println(shapeService.getTriangle(). getName());	
   }
}
