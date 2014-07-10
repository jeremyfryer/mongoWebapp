package org.jfryer.MongoDAO;

import static org.junit.Assert.*;

import java.net.UnknownHostException;

import org.junit.Test;

import com.mongodb.DBObject;

public class TestMongoDAO {

	@Test
	public void test() throws UnknownHostException {
		DBObject student = MongoDAO.getOneStudent();
		assertNotNull("Object is null", student);
	}

}
