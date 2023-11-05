package classContain;

public class WhatClassContain {
	/*
	 * class contain 5 things
	 *   1  Variables
	 *   2 constructor
	 *   3 methods
	 *   4 instance block
	 *   5 static block
	 *   
	 */

	String fistName;
	static String lastName;

	public WhatClassContain(String fistName) {
		super();
		this.fistName = fistName;
		
		
		
	}
	
	
	
	public static void main(String[] args) {

	}

	public void fullName() {
		int money = 5000;
	}

	{
		System.out.print("hello");
	}

	static {
		System.out.print(lastName = "Molla");
	}
}
