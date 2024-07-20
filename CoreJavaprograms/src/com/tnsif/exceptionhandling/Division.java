package com.tnsif.exceptionhandling;

import java.util.InputMismatchException;

public class Division {
public static void divide() {
	int a=6,b=0,c;
	
	try {
		c=a/b;
		System.out.println("division"+c);
	}
	catch(InputMismatchException i)
	{
		System.out.println("EXCEPTION CAUGHt"+i.getMessage());

		
	}
	catch(ArithmeticException e) {
		System.out.println("exception caught"+e.getMessage());
	}
}
}
