package com.spring.aop;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AopClass {

/*
  //	@Before("execution(public String com.spring.aop.Circle.getName())")
//	@Before("execution(* get*())")
//	@Before("execution(* get*(*))")
//	@Before("execution(* get*(..))")
//	@Before("execution(* get*(*))")
	@Before("execution(* com.spring.aop.*.get*(..))")
	public void LoggingAdvice()
	{
		System.out.println("Advice run before the execution of getName method");
	}
    
	@Before("execution(* com.spring.aop.*.*get(..))")
	public void secondAdvice()
	{
		System.out.println("Second Advice executed");
	}
	*/
	
/*	@Before("allGetters()")
	public void LoggingAdvice()
	{
		System.out.println("Advice run before the execution of getName method");
	}


	@Before("allGetters()")
	public void secondAdvice()
	{
		System.out.println("Second Advice executed");
	}

	@Pointcut("execution(* get*())")
	public void allGetters()
	{}
*/
	
	/*@Before("allCircleMethods() && allCircleMethods() ")
	public void secondAdvice()
	{
		System.out.println("within the  cirecle methods are executed");
	}
	
	@Pointcut("execution(* get*())")
	public void allGetters()
	{}
	
//    @Pointcut("within(com.spring.aop.Circle)")
	@Pointcut("within(com.spring.aop..*)")
    public void allCircleMethods()
    {
    }
  */
	
	/*@Before("allCircleMethods()")
	public void secondAdvice(Joinpoint joinpoint)*/
	{
//		System.out.println(joinpoint.toString());
//		System.out.println(joinpoint.getTarget());
	}
	
 
	
//    @Pointcut("within(com.spring.aop.Circle)")
/*	@Pointcut("within(com.spring.aop.Circle)")
    public void allCircleMethods(){}*/
	
	
	
//	 @Before("args(name)")
//	 @AfterReturning(pointcut="args(name)", returning="re")
//	 public void StringArgumentsMethods(String name, String re)
//	 {
//		 System.out.println("All the methods that takes the String arguments "+name+" and the String is returning the value "+re);
//	 }
	 
	/* @AfterThrowing(pointcut="args(name)", throwing="ex")
	 public void throwing(String name,Exception ex)
	 {
		 System.out.println("throwing the exception in the setter method "+name+" the exception thrown in the method is "+ex);
	 }
	*/
	
	
	/*@Around("allGetters()")
	public Object myAround(ProceedingJoinPoint proceedingJoinPoint)
	{
		Object object=null;
       try {
    	   System.out.println("before executing the around method");
		object =proceedingJoinPoint.proceed();
		System.out.println("after executing the around method");
	} catch (Throwable e) {
     System.out.println("into the catch block");
		e.printStackTrace();
	}		
       System.out.println("into the finally block");
       return object;
	}
	
	@Pointcut("execution(* get*())")
	public void allGetters(){}
	
	
	@Around("@annotation(com.spring.aop.Loggable)")
   public void mk(){}
	*/
	
	@Around("point()")
	public void around(ProceedingJoinPoint proceedingJoinPoint)
	{
		Object object=null;
		try {
	          System.out.println("Befor execution");
	          object=proceedingJoinPoint.proceed();
		} catch (Throwable e) {
			System.out.println("into the catch block");
		}
		System.out.println("inside the finally block");
		
	}
	
	
	
	
	
	@Pointcut("execution(* get*())")
	public void point()
	{}


}
