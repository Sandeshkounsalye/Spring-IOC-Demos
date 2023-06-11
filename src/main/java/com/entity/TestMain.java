package com.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class TestMain {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("employee.xml");
		
		//Due to type cast data may be leak
		//Employee employee=(Employee) context.getBean("empObj");
		
		Employee employee2=context.getBean("empObj",Employee.class);
		
		System.out.println(employee2);
		System.out.println(employee2.getEmpSalery());
	}

}
