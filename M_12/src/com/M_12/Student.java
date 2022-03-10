package com.M_12;
public class Student {
	int sid;
	String sname;
	 public void show(int sid,String sname) {
		 this.sid = sid;
		 this.sname = sname;
	 }
	 public void setSid() {
		 this.sid=sid;
	 }
	 public int getSid() {
		 return sid;
	 }
	 public void setSname() {
		 this.sname=sname;
	 }
	 public String getSname() {
		 return sname;
	 }
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
          Student s = new Student();
          s.show(1,"Akshay");
          System.out.println(s.getSid()+"\n"+s.getSname());
          
	}

}
