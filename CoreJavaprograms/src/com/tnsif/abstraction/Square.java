package com.tnsif.abstraction;

public class Square extends Shape {
	private float side;
	public Square() {//default
		side=2.0f;
	}
	public Square(float side) {//parameterized
		this.side=side;
	}
	
	@Override
	void calarea() {
		//G ERAT
		super.area=side*side;
	}
	

}
