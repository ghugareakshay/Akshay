package com.exceptionhandling;

public class AssignmentTast
{		
		public static void main(String args[])
                  {	
			
			
			try{    
                int a[]=new int[5];    
                a[5]=30/0; 
               // a[10]=12;
                System.out.println(a[10]);
                                              
               }    
               catch(/*Arithmetic*/Exception /*  |  ArrayIndexOutOfBoundsException*/ e)  
                  {  
                   System.out.println("Can't divided by Zero..."/*+e*/);  
                  }    
             /*catch(ArrayIndexOutOfBoundsException e)  
                  {  
                   System.out.println("stay in your limit...");  
                  }    
               */           
               System.out.println("rest of the code\n");    
      System.out.println("multiple catch is allow but exception can't handle because:\n");
      System.out.println("1)ArithmeticException can't handle ArrayIndexOutOfBoundException");
      System.out.println("2)ArrayIndexOutOfBoundException can't handle  ArithmeticException ");
      System.out.println("Thats why only show the ecxeption occure first in try block");
      System.out.println(" /* '|' : line is new feature to handle multiple exception */");
                  }  		           
}
