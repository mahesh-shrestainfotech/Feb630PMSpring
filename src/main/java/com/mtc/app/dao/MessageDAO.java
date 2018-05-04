package com.mtc.app.dao;

import org.springframework.stereotype.Component;

@Component("messageDAO")
public class MessageDAO implements IMessageDAO{
	
	public String fetchMessage() {
		System.out.println("MessageDAO using JDBC API");
		return "DB : Welcome to Spring Framework";
	}

}
