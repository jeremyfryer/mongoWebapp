package org.jfryer.MongoWebapp;

import static org.junit.Assert.*;

import java.net.UnknownHostException;

import org.junit.Test;
import org.springframework.ui.ModelMap;

public class TestMongoWebappController {

	@Test
	public void testMongo() throws UnknownHostException {
		MongoWebappController webappController = new MongoWebappController();
		ModelMap model = new ModelMap();
		
		String retrunString = webappController.mongo(model);
		System.out.println(model);
	}
	
	@Test
	public void testWelcome() throws UnknownHostException {
		MongoWebappController webappController = new MongoWebappController();
		ModelMap model = new ModelMap();
		
		String retrunString = webappController.welcome(model);
		System.out.println(model);
	}

}
