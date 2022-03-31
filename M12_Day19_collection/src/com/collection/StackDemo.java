package com.collection;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack s1 = new Stack();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        
        System.out.println("Adding element in Stack:"+s1);
        s1.pop();
        System.out.println("Removing element in Stack:"+s1);
	}

}
