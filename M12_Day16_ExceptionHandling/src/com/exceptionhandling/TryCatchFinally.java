package com.exceptionhandling;

public class TryCatchFinally {

	public static void main(String[] args) {
		int a = 10/2;
		System.out.println(a);
		
		int b = 10/4;
		System.out.println(b);
		
		try{
			int c = 10/0;
		System.out.println(c);
		}
		catch(Exception e) {
			System.out.println(e);
		}
        finally {
			
			        System.out.println("(Finally says): I am Always Exicute Error are comming or not");
		        }		
		int d = 10/5;
		System.out.println(d);
		
		

	}

}
