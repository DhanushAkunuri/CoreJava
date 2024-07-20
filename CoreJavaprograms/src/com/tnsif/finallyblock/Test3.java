package com.tnsif.finallyblock;
//exception with no matching catch block
public class Test3 {
public static void main(String[] args) {
	try {
		System.out.println(100/0);
	}
	catch(ArithmeticException e) {
	System.out.println("welcome");
	
}	
finally{
	System.out.println("welcome to java");
	
}
	System.out.println("end");

}
}
