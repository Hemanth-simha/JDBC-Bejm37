package com.jspiders.marriage.first;

import java.io.IOException;

public class UserInterface {

	public static void main(String[] args) throws IOException {
		
//		 Person person = new Person();
//		 person.setName("Hemanth");
//		 person.setAge(20);
//		 person.setContact(7676866101l);
//		 
//		 File photo = new File("C:\\jspiders\\J2ee Software\\Softwares\\Resources\\profile.jpg");
//		 person.setPhoto(photo);
//		 
//		 InsertPersonDetails personDetails = new InsertPersonDetails();
//		 personDetails.insert(person);
		
		
		RetrievePersonDetails personDetails = new RetrievePersonDetails();
		personDetails.retrieve();
	}

}
