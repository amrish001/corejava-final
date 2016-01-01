package com.digitek.exceptions;

public class TryCatchExample {

	public static void main(String[] args) {
		trycatch1(null);

	}

	public static void trycatch1(String re){
		
		int no1 = 10;
		int no2 = 100;
		
		String[] arrValues = {"val1", "val2"};
					
		
		try{
		    int result = no1/no2;
		    System.out.println("result:" + result);
		
		    System.out.println(arrValues[3]); 		
		} catch(ArithmeticException e){
			 System.out.println("ArithmeticException::Divison by zero is not allowed");  
		}
		  catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Runtime exception happened: "+ re);
		  }
			
			int addition1 = no1=no2;
		System.out.println("addition:"+ addition1);
	}
}
