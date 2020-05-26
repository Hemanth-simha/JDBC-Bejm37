package com.jspiders.marriage.first;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class RetrievePersonDetails {
	
	public void retrieve() throws IOException {
		
		Connection CON = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
		Driver	driverref = new Driver();
		DriverManager.registerDriver(driverref);
		
		String dburl="jdbc:mysql://localhost:3306/marriage?user=root&password=root";
		CON = DriverManager.getConnection(dburl);
		
		String query = " select photo from person ";
		
		File file = new File("profile.jpg");
		FileOutputStream  outputStream = new FileOutputStream(file);
		
		stmt = CON.createStatement();
		 rs = stmt.executeQuery(query);
		
		 while(rs.next()) {
			 
			InputStream   inputStream = rs.getBinaryStream("photo");
			byte []buffer = new byte[1024];// 1 0
			while(inputStream.read(buffer)>0) {
				outputStream.write(buffer);
			}
				
		 }
		 System.out.println("Photo is Retrieved");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
			try {
				if(CON!=null) {
					CON.close();
				}
				if(stmt!=null) {
					stmt.close();
				}
				if(rs!=null) {
					rs.close();
				}
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
			
			
		}
		
		
	}
	
}
