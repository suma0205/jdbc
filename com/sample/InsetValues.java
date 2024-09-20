package com.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsetValues {
  public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
	Statement statement=connection.createStatement();
	statement.execute("insert into sam values(3,'asha','a@gmail.com',8276743210)");
	connection.close();
	System.out.println("data is inserted");
}
}
