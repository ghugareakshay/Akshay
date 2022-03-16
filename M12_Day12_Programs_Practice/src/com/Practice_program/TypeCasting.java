package com.Practice_program;

public class TypeCasting {

	public static void main(String[] args) {
		System.out.println("Type-Casting");
		int i= 10;
		char c = (char)i;
		System.out.println("Converting int to char:"+"Not convert"+c);
		
		char char1 = 'A';
		int i1 = (int)char1;
		System.out.println("Converting Char:"+char1+" to int:"+ i1);
		
		/*String s = "Akshay"; can`t convert string to int 
		int i2  = (int) s;
		
		 int i2 = 10;    can`t convert int to string
		 String s = (String)i2;*/
		
		
		
		float f = 10.532f;
		long l = (long)f;
		System.out.print("\nConverting float:+"+f+" to long: "+l);
		}

}
