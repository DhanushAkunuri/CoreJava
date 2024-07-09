package com.tnsif.staticexample;

public class Student {
int rollno;
String name;
static String college="sriindhu";	//STATIC MEM
static void change() {	//STATICMETHOD
	college="IIT";
	//name="cd" cannot call non static member
}
Student(int r,String n){
	rollno=r;
	name=n;
}
void display() {
	System.out.println(rollno+" "+name+" "+college);
	
}
}
