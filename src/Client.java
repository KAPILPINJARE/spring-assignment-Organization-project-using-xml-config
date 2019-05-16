package com.capgemini.spring.client;

import org.springframework.context.*;
import org.springframework.context.support.*;

import com.capgemini.spring.organization.*;

public class Client
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
		Organization org = (Organization) context.getBean(Organization.class);
		System.out.println(org.toString());
	}
}