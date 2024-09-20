package edu.product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Controller {
	 public Connection getcon() throws ClassNotFoundException, SQLException
	 {
		 Class.forName("com.mysql.cj.jdbc.Driver");
         Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/product","root","root");
         return connection;//calling the same method again
	 }
    public int  Insert(Product product) throws ClassNotFoundException, SQLException {
    	Connection connection=getcon();
    	PreparedStatement preparedStatement=connection.prepareStatement("insert into product1 values(?,?,?,?)");
    	preparedStatement.setInt(1,product.getId());
    	preparedStatement.setString(2, product.getName());
    	preparedStatement.setString(3, product.getDescprition());
    	preparedStatement.setInt(4,product.getPrice());
    	int count=preparedStatement.executeUpdate();
    	return count;
    }
    public int update(int id,String name) throws ClassNotFoundException, SQLException {
    	Connection connection=getcon();
    	PreparedStatement preparedStatement=connection.prepareStatement("update product1 set  name=? where id=?");
    	preparedStatement.setString(1, name);
    	preparedStatement.setInt(2, id);
    	int count=preparedStatement.executeUpdate();
    	return count;
    }
    public int deleteById(int id) throws ClassNotFoundException, SQLException {
    	Connection connection=getcon();
    	PreparedStatement preparedStatement=connection.prepareStatement("delete from product1 where id=?");
    	preparedStatement.setInt(1, id);
    	int count=preparedStatement.executeUpdate();
    	return count;
    	
    }
    public Product fetchById(int id) throws ClassNotFoundException, SQLException {
    	Connection connection=getcon();
    	PreparedStatement preparedStatement=connection.prepareStatement("select * from product1 where id=?");
    	preparedStatement.setInt(1, id);
    	ResultSet rs=preparedStatement.executeQuery();
    	Product product=new Product();
    	if(rs.next()) {
    		product.setId(rs.getInt(1));
    		product.setName(rs.getString(2));
    		product.setDescprition(rs.getString(3));
    		product.setPrice(rs.getInt(4));
    	}
    	return product;
    }
}
