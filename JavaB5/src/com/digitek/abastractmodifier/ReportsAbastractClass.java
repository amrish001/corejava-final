package com.digitek.abastractmodifier;

	public abstract  class ReportsAbastractClass {
   
		public void generateHeader() {	
    	System.out.println("*************HEADER*************");
    	
    }

    public void putLogo() {
        System.out.println("***********LOGO********");
    }

    public abstract void generateBody();

    public void generateFooter(){
        System.out.println("***********FOOTER********");
    }
    
    
    
	}