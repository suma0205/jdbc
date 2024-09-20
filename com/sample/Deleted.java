package com.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Deleted {
  public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
	Statement statement=connection.createStatement();
	int a=statement.executeUpdate("delete from save");
	System.out.println(a);
	connection.close();
	System.out.println("table is deleted");
}
}
