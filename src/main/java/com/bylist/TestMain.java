package com.bylist;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		
	
	ApplicationContext context=new ClassPathXmlApplicationContext("employe.task.xml");
	Employee employee=context.getBean("empObj",Employee.class);
	
	
	System.out.println(employee);
	System.out.println(employee.getListOfList());
	
	}
    
}
