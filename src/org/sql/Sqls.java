package org.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Sqls {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		
		
		
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "anbarasan");
		
		String s="select * from employees";
		
		PreparedStatement prepareStatement = connection.prepareStatement(s);
		
		ResultSet executeQuery = prepareStatement.executeQuery();
		
		
		while (executeQuery.next()) {
			
			int int1 = executeQuery.getInt("employee_id");
			
			System.out.println(int1);
			
			
			String string = executeQuery.getString("first_name");
			
			
			System.out.println(string);
			
			
			
			
			
			
			
		}
		
		
		connection.close();
		
		
		
		
		
	}
	
}
