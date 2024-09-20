package edu.product;

import java.sql.SQLException;
import java.util.Scanner;

public class View {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Controller con=new Controller();
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		while(flag)
		{
			System.out.println("Enetr 1 to insert\n 2 to update\n 3 to delete\n 4 to fetchbyid\n to exit");
			int option=sc.nextInt();
			switch(option) {
			case 1:{
				System.out.println("enter the id");
				int id=sc.nextInt();
				System.out.println("eneter the name");
				String name=sc.next();
				System.out.println("enter te decription");
				String description=sc.next();
				System.out.println("enetr the price");
				int price=sc.nextInt();
				Product product=new Product(id,name,description,price);
				int count=con.Insert(product);
				if(count>0) {
					System.out.println("data inserted successully");
				}
				else {
					System.out.println("data not inserted");
				}
				break;
			}
			case 2:{
				System.out.println("enter the id you need to update");
				int id=sc.nextInt();
				System.out.println("eneter the new name");
				String name=sc.next();
				int count=con.update(id, name);
				if(count>0) {
					System.out.println("name update successfuly");
				}
				else {
					System.out.println("data not updated");
				}
				break;
			}
			case 3:{
				System.out.println("enter the id you want to delete");
				int id=sc.nextInt();
				int count=con.deleteById(id);
				if(count>0) {
					System.out.println("data deleted successfully");
				}
				else {
					System.out.println("data not deleted");
				}
				break;
			}
			case 4:{
				System.out.println("enter the id you want to fetch to fetch");
				int id=sc.nextInt();
				Product product=con.fetchById(id);
				System.out.println(product);
				break;
			}
			case 5:{
				System.out.println("Thank you");
				break;
			}
	       default:
					System.out.println("Wrong choice");
			}
		}
	}

}
