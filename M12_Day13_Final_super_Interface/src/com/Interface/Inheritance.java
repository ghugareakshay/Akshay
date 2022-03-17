package com.Interface;

 interface Abc{
	void m1();
	
	
}
public class  Inheritance implements Abc {

	
	public void m1() {
		
		System.out.println("Hello Interface");
	}
	
	public  static void main(String[] args) {
		
        Inheritance t = new Inheritance();
        t.m1();
	}

	

}
