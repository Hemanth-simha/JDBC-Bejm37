package com.jspiders.practice.third;

import java.io.File;
import java.io.IOException;

public class MyPropertiesClass {

	public static void main(String[] args) {
		
		 File file = new File("C:\\jspiders\\bejm37/MyProp.properties");
		 try {
			boolean bool = file.createNewFile();
			System.out.println(bool);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// name = value ----> Properties file object
		// name = value ----> HashMap collection object
		
	}

}
