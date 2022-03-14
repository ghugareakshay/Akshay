package opps.akshay;

import java.util.Scanner;

class Test2{
	void show() {
		int sId=1;
	    String sName="Akshay Bhimrao Ghugare";
	    String batch = "M_12";
	}
}
 class Test3 extends Test2{
	void show1() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your Father Name:");
		String a =s.next();
		System.out.println("Father Name:"+a);
		
		
	}
	
 }

class Inheritance extends Test2 {

	public static void main(String[] args) {
		Test3 t = new Test3();
		t.show1();
		Test2 t1 = new Test2();
		t1.show();
	}

}
