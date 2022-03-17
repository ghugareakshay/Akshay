package com.super_final;
/*class Test{
	final void m1() {
		
	}
}*/

/*final class Test2{
	int a =10;
}*/


public class Finale /*extends Test*/ /*extends Test2*/ {
	
	/*void m1() {
		//cant override
	}*/
       
	final static int a=10;
	public static void main(String[] args) {
		
           System.out.println(a);
           //a=a+1;   can`t change value because a is final 
           
           
           System.out.println("Final use with:\n 1.variable :\n cant change value of Variable ");
           System.out.println("Final use with:\n 2.Method :\n cant override the method ");
           System.out.println("Final use with:\n 3.class :\n cant inherited the class ");

	}

}
