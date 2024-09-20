package com.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Alter {
  public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
	Statement statement=connection.createStatement();
	statement.execute("alter table student add sname varchar(10) not null");
	connection.close();
	System.out.println("table is altered");
}
}
