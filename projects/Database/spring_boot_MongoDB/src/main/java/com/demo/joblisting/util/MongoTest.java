package com.demo.joblisting.util;

/*import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;*/

public class MongoTest {/*

	static DBCollection table;

	public static void main(String[] args) {

		MongoClient mongo = null;

		try {

			mongo = new MongoClient("localhost", 27017);

		} catch (Exception e) {
			
			e.printStackTrace();
		}

		DB db = mongo.getDB("jobdb");

		table = db.getCollection("JobPost");

		BasicDBObject searchQuery = new BasicDBObject();

		searchQuery.put("id", "63057298");

		DBCursor cursor = table.find(searchQuery);

		while (cursor.hasNext()) {

			System.out.println(cursor.next());
		}
	}
*/}
