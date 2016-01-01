package com.digitek.interfaces;

public interface IPaymentProcessor {

	String statusofPayment - "unprocess"; // same as: public static final string statusofPayment - "unprocessed"  
	
	String processPayment(String paymentInfo);;   // this is same as: public abstract String processPaymnet 



}

