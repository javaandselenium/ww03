package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class Test1 {
	@Test
	public void demo() throws SQLException {
		//Step:1 Register to the database
		Driver d=new Driver();
		DriverManager.registerDriver(d);
		
		//Step:2 Connect to Database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/www03","root","root");
		
		//Step:3 create sql query statement
				Statement statement = con.createStatement();
		       String query = "select * from login";
		
		       //step:4 execute the query
		       ResultSet res = statement.executeQuery(query);
		       while(res.next()) {
		    	   System.out.println(res.getString(1));
		    	   System.out.println(res.getString(2));
		       }
		       
		       //Step:5 close the connection
		       con.close();
	}

}
