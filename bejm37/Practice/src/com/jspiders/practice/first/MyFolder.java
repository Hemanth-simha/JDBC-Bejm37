package com.jspiders.practice.first;

import java.io.File;

public class MyFolder {

	public static void main(String[] args) {
		
		File file = new File("C:\\jspiders\\bejm37/MyFolder");
		boolean bool= file.mkdir();
		System.out.println(bool);
	}

}
