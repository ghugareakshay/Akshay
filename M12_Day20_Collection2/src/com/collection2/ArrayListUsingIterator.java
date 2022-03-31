package com.collection2;

import java.util.ArrayList;

import java.util.Iterator;

public class ArrayListUsingIterator {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Akshay");
		al.add("Bhimrao");
		al.add("Ghugare");
		System.out.println("Show ArrayList using Iterator");
		Iterator it =  al.iterator();
        while(it.hasNext()) {
        	System.out.println(it.next());
        }
	}

}
