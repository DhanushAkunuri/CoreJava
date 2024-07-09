package com.tnsif.scannerclass;

import java.util.Scanner;

//demo for scanner
public class Scannerexample {
public static void main(String[] args) {
	
Scanner sc=new Scanner(System.in);

System.out.println("enter your name");
String name=sc.nextLine();

System.out.println("enter the roll number");
int roll=sc.nextInt();
System.out.println("name "+name+" and roll "+roll);
sc.close();
}
}
