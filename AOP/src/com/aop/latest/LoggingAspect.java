package com.aop.latest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

//	@Before("execution(public String getName())")
//	@Before("execution(public String com.aop.latest.Circle.getName())")
//	@Before("execution(public String get*())")  // excute this method for any method in the project which is started with get and return type is String but there is no argument in the method
//	@Before("execution(public * getN*())")  // excute this method for any method in the project which is started with getN and return type is of any type  but there is no argument in the method
//	@Before("execution(public * get*())")  // excute this method for any method in the project which is started with get and return type is of any type but there is no argument in the method
//	@Before("execution(* get*())")  // excute this method for any method in the project which is started with get and return type is of any type and access modifier is of any type but there is no argument in the method
//	@Before("execution(* get*(*))")  // excute this method for any method in the project which is started with get and return type is of any type and access modifier is of any type  and type of arguments.	
//	@Before("execution(* get*(..))")  // excute this method for any method in the project which is started with get and return type is of any type and access modifier is of any type  and type of arguments or zero  arguments.
//	@Before("execution(* com.aop.latest.*.get*(..))")  // excute this method for any method in the project which is started with get and return type is of any type and access modifier is of any type  and type of arguments or zero  arguments for any class in the package com.aop.latest .
	@Before("pointCutMethod()")
	public void LogginAdvice(JoinPoint joinPoint)
	{
		System.out.println(joinPoint.toString());
		Object target = joinPoint.getTarget();
		System.out.println(joinPoint.getTarget());
		System.out.println("getName method is executed");
	}
	
//	@Pointcut("args(String)")
	@Before("args(name)")
	public void args1(String name)
	{
		System.out.println("method which takes String as an argument "+name);
	}
	
	
	
//	@Before("execution(* com.aop.latest.*.get*(..))")  
	@Before("pointCutMethod()") // using point so that we have one point cut and we it on many advice  
	public void LogginAdvice1()
	{
		System.out.println("getName method is executed");
	}
	
	@Pointcut("execution(* get*())") // created point cut and we can use this point cut in different advice
	public void pointCutMethod()
	{
	}

//	and conditon in the advice for pointcuts
	@Before("pointCutMethod() && allCircle()")
	public void allGetterMethodInCircle()
	{
		System.out.println("all getter method of Circle class");
	}
	
	@Pointcut("within(com.aop.latest.Circle)")  // within is used to within in particular class or particular package
//	@Pointcut("within(com.aop.latest.*)")  // all the classess inside the package  
//	@Pointcut("within(com.aop.latest..*)") // all the classess inside the package and subpackage
	public void allCircle()
	{
	}
	
	
	
} 
