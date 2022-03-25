package com.throw_throws;

public class ThorwDemo {
	public static void validate(int age) {  
        if(age<18) {  
            
            throw new ArithmeticException("Person is not eligible to marry");    
        }  
        else {  
            System.out.println("Person is eligible to marry");  
        }  
    }  
   
    public static void main(String args[]){  
        
        validate(20);  // validate(13);  person is not elligible 
        System.out.println("rest of the code...");    
  }   

}
