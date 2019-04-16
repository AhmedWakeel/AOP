package com.aop.latest;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

	@Before("execution(public String getName())")
	public void LogginAdvice()
	{
		System.out.println("getName method is executed");
	}
}
