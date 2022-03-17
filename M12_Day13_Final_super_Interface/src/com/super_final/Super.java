package com.super_final;

class Test{
	int student_Id=1;
	String student_Name="akshay";
}
class Test2 extends Test{
	String add="Aurangabad";
	
	void show() {
		System.out.println(add);
		System.out.println("Student Id:"+super.student_Id+"\n"+"Student Name"+super.student_Name);
		
	}
}
public class Super {

	public static void main(String[] args) {
		Test2 t = new Test2();
		t.show();
	}

}
