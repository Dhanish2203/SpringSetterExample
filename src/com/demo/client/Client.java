package com.demo.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.bean.Employee;

public class Client {
	public static void main(String args[]) {
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Employee employee=(Employee)context.getBean("emp");
		Employee employee1=(Employee)context.getBean("emp");
		System.out.println("Hascode of employee:"+employee.hashCode());
		System.out.println("Hascode of employee1:"+employee1.hashCode());
		if(employee==employee1) {
			System.out.println("Same instance");
		}else {
			System.out.println("different instance");
		}
			
	}	
	
}
