package com.Interface;

interface  BankDetails{
	void getName(String name);
	void getIfsccode(String ifsc);
}

class Bankname implements BankDetails{

	
	public void getName(String name) {
		System.out.println("Bank Name is:"+name);
		
	}

	
	public void getIfsccode(String ifsc) {
		System.out.println("Bank ifsc code:"+ifsc);
		
	}
	
}
	
public class Main  {

	public static void main(String[] args) {
		Bankname b = new Bankname();
		b.getName("Bank of Maharashtra");
        b.getIfsccode("MAHB00123");
	}
	}


