package com.example;

import java.io.IOException;

import org.neo4j.rest.graphdb.RestAPI;
import org.neo4j.rest.graphdb.RestAPIFacade;
import org.neo4j.rest.graphdb.query.RestCypherQueryEngine;

public final class RestHang {
	
	private static final RestAPI rest = new RestAPIFacade(
			"http://localhost:7474/db/data/");
	private static final RestCypherQueryEngine engine = new RestCypherQueryEngine(
			rest);
	
	public static void main(String[] args) throws IOException {
		rest.query("start n=node(*) return n", null);
	}
}
