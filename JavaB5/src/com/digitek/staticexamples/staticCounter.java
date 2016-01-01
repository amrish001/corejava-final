package com.digitek.staticexamples;

public class staticCounter {

	//instance(object) variables.Not visible to other objects.
	int counter = 0;
	
	// class variable. This value is visible to all the objects.
	  static int staticCounter = 0;
	
	//constructor 
	StaticCounter()  {
	    staticCounter++;
	    counter++;	
	
	public static void main(String[] args) {
		StaticCounter sc - new StaticCounter();
		System.out.println("counter value:" + sc.counter);
		System.out.println("static conter:" + staticCounter);
		System.out.println("counter value:" + Sc2.counter);
		System.out.println("static counter:" + Staticcounter):
	}"
}
