package com.digitek.finalexamples;

public class FinalExample {

	//final variables 
	final int no1 = 10;
			
	// non-final variable
	int no2 = 15;
	
	public void addNumber(){
	    
	
	int sum = no1+no2;
	System.out.println("Sum of number:" + sum);
		
	}
		
	public static void main(String[] args) {
		FinalExample fe = new FinalExample();
		fe.addNumber();
	}

}
