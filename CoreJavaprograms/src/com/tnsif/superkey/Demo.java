package com.tnsif.superkey;

public class Demo extends Superex {
	int a=7;
 Demo() {
	 super();
 }
		
	void drinking() {
		System.out.println("tea");
	}
	void display() {
		System.out.println(a);
		System.out.println(super.a);
		drinking();
		super.drinking();
	}
	


	public static void main(String[] args) {
		Demo d =new Demo();
		d.display();
		
	}
}
