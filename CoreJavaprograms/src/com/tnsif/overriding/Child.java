package com.tnsif.overriding;

public class Child extends Father {
	@Override
	void drinking() {
		System.out.println("horlicks");
		
	System.out.println();
	}
	public static void main(String[] args) {
		Child c =new Child();
		c.drinking();
		
		
	}

}
