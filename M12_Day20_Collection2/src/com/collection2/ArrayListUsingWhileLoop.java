package com.collection2;

import java.util.ArrayList;

public class ArrayListUsingWhileLoop {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Akshay");
		al.add("Bhimrao");
		al.add("Ghugare");
		System.out.println("Show ArrayList using While Loop");
		int count=0;
		while(al.size()>count) {
			System.out.println(al.get(count));
			count++;
		}
	}

}
