package com.brecnis.learn.helloworld;

import com.brecnis.learn.entities.SimpleRecord;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		SimpleRecord simpleRecord = new SimpleRecord("Dingi", 56);
		System.out.println(simpleRecord);
	}

}
