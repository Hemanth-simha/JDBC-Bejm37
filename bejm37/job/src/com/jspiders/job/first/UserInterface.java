package com.jspiders.job.first;

import java.io.File;
import java.io.FileNotFoundException;

public class UserInterface {

	public static void main(String[] args) {
		
		Candidate candidate = new Candidate();
		candidate.setName("Blake");
		candidate.setEmail("blake@abc.com");
	    
		File resume = new File("C:\\jspiders\\J2ee Software\\Softwares\\Resources\\sample.txt");
		candidate.setResume(resume);
		candidate.setContact(7676866101l);
		
		
		InsertCandidateDetails candidateDetails = new InsertCandidateDetails();
		try {
			candidateDetails.insert(candidate);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
