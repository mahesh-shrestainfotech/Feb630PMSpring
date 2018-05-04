package com.mtc.app.dao;

import org.springframework.stereotype.Component;

//@Component
public class MessageDAOHib implements IMessageDAO{
	
	public String fetchMessage() {
		System.out.println("MessageDAOHib using Hibernate");
		return "DB : Spring Framework's Dependency Injection";
	}

}
