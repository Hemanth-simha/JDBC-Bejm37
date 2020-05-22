package com.jspiders.practice.first;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
	  
	     Scanner sc = null;
	     sc= new Scanner(System.in);
		 int x;
		 System.out.print("Enter the value of x : ");
		 x = sc.nextInt();
		 System.out.println("x = "+x);
		 if(sc!=null) {
		   sc.close();
		 }
		 // 100 lines
	}
	
}
