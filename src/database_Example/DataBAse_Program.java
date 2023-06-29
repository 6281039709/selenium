package database_Example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBAse_Program {

	public static void main(String[] args) throws SQLException {
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","tiger");
		Statement st =con.createStatement();
		System.out.println("connected...........");
		ResultSet res =st.executeQuery("select * from emp");
		  
		while(res.next()) {
			
		
		String un = res.getString(1);
		System.out.println(un);
		
		
		
		
	
		
		
		
		
	}
	}
}
