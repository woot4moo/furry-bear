package com.example;

import org.neo4j.cypher.ExecutionEngine;
import org.neo4j.cypher.ExecutionResult;
import org.neo4j.kernel.impl.util.StringLogger;
import org.neo4j.rest.graphdb.RestGraphDatabase;

public final class RestNoHang {

	private static final RestGraphDatabase rest = new RestGraphDatabase("http://localhost:7474/db/data/");
	private static final ExecutionEngine engine = new ExecutionEngine(rest,
			StringLogger.SYSTEM);

	public static void main(String[] args) {
		System.out.println(rest.getNodeById(0));
		ExecutionResult result = engine.execute("start n=node(0) return n");
		System.out.println(result.columnAs("n"));
	}
}
