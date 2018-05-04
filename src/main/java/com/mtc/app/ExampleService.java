package com.mtc.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mtc.app.dao.IMessageDAO;
import com.mtc.app.dao.MessageDAO;
import com.mtc.app.dao.MessageDAOHib;


/**
 * {@link Service} with hard-coded input data.
 */
@Component
public class ExampleService implements Service {
	
	@Autowired
	private IMessageDAO messageDAO;
	//private MessageDAO messageDAO;
	
	//private MessageDAOHib messageDAOHib;
	
	public String getMessage() {
		return messageDAO.fetchMessage();	
	}

}
