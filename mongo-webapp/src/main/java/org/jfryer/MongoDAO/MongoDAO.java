package org.jfryer.MongoDAO;

import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

public class MongoDAO {
	private static final String MONGOHOST = "192.168.1.108";
	private static final int MONGOPORT = 27017;
	private static final String MONGODB = "school";
	private static final String MONGOCOLLECTION = "students";
	
	public static DBObject getOneStudent() throws UnknownHostException {
		
		final MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://"+MONGOHOST+":"+MONGOPORT));
		final DB schoolDatabase = mongoClient.getDB(MONGODB);
		final DBCollection studentsCollection = schoolDatabase.getCollection(MONGOCOLLECTION);
		
		return studentsCollection.findOne();
		
		
	}
	
}
