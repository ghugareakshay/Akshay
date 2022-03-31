package com.collection2;
import java.util.ArrayList;
import java.util.Iterator;
class LinkedList 
{
	public static void main(String[] args) 
	{
		LinkedList l= new LinkedList();
		l.add("Akshay");
		l.add("Bhimrao");
		l.add("Ghugare");
		System.out.println("\n\nUsing For Loop");
        for(int i=0;i<l.size();i++) {
     	   System.out.println(l.get(i));
        }
        
        System.out.println("Show LinkedList using Advanced For Loop");
		for(String str:l) {
			System.out.println(str);
		}
		
		System.out.println("Show LinkedList using While Loop");
		int count=0;
		while(l.size()>count) {
			System.out.println(l.get(count));
			count++;
		}
		System.out.println("Show linkedList using Iterator");
		Iterator it =  l.iterator();
        while(it.hasNext()) {
        	System.out.println(it.next());
        }

	}
}
