package com.tnsif.interfacedemo;

public class Demo implements Childinterface{

	@Override
	public void show() {
		System.out.println("SHOW");
	}

	@Override
	public void print() {
		System.out.println("PRINT");
	}
	public static void main(String[] args) {
		Demo d=new Demo();
		d.show();
		d.print();
	}
	

}
