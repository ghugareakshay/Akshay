package com.collection2;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		System.out.println("ArrayListDemo");
		ArrayList l = new ArrayList();
		l.add(10);
		l.add("A");
		l.add("10");
		l.remove(0);
		System.out.println("ArrayList element is:\n"+l);
		l.remove(0);
		System.out.println("ArrayList Element is removed\n"+l);
		l.clear();
     	System.out.println("Clear the ArrayList:\n"+l);
	     l.add(12);
		 l.add("ganesah");
		 l.add(8978);
		 System.out.println("Ad the element in list:\n"+l);
		 l.add(2,"uru");
		 System.out.println(l);
		 l.set(2, "Akshay");
		 System.out.println("Set the element :\n"+l);
		 
		 System.out.println("\n\nUsing For Loop");
           for(int i=0;i<l.size();i++) {
        	   System.out.println(l.get(i));
           }
           
	}

}
