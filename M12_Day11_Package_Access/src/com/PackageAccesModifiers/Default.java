package com.PackageAccesModifiers;

//do not apply any modifiers with class ,method,variable that time default modifiers apply automatically

class Test{
     void show() {
		System.out.println("Hello Default Access MOdifiers");
	}
}
public class Default {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Test t = new Test();
		t.show();

	}

}
