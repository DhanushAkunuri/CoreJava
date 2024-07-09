package com.tnsif.interfacedemo;

public class Warrior implements Weapon,Character{

	@Override
	public void attack() {
		System.out.println("welcome");
		
	}

	@Override
	public void use() {
		System.out.println("attack");
		
	}
	public static void main(String[] args) {
		Warrior w=new Warrior();
		w.attack();
		w.use();
		
	}
	

}
