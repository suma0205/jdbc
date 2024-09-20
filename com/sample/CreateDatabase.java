package com.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDatabase 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");//packagename.classname
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/?","root","root");
		System.out.println(connection);
		Statement statement=connection.createStatement();
		statement.execute("create database student");
		System.out.println("database created");
		connection.close();
	}
}
