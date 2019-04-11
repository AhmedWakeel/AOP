package com.spring.aop.copy.usingxml;

import org.aspectj.lang.ProceedingJoinPoint;


public class AopClass {


	
	
	public Object around(ProceedingJoinPoint proceedingJoinPoint)
	{
		Object object=null;
		try {
	          System.out.println("Befor execution");
	          object=proceedingJoinPoint.proceed();
		} catch (Throwable e) {
			System.out.println("into the catch block");
		}
		System.out.println("inside the finally block");
		
		return object;
		
	}
	
	
	
	
	
	

}
