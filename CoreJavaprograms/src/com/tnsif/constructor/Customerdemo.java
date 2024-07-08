package com.tnsif.constructor;
import java.util.Scanner;

public class Customerdemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name");
		String name=sc.nextLine();
		
		System.out.println("enter your cid");
		int cid=sc.nextInt();
		
		System.out.println("enter your adress");
		String add =sc.next();
		Customer c=new Customer();
		c.setName(name);
		c.setCid(cid);
		c.setCadress(add);
		
		System.out.println(c);
		//instanceof
		boolean out=c instanceof Customer;
		System.out.println(out);
	}

}
