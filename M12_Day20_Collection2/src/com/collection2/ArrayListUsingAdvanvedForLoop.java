package com.collection2;

import java.util.ArrayList;

public class ArrayListUsingAdvanvedForLoop {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Akshay");
		al.add("Bhimrao");
		al.add("Ghugare");
		System.out.println("Show ArrayList using Advanced For Loop");
		for(String str:al) {
			System.out.println(str);
		}

	}

}
