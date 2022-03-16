package com.ConditionalStatement;

import java.util.Scanner;

public class Ternaryconditionalstatement {

	public static void main(String[] args) {
		System.out.println("Enter two number:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String less;
		less= a<b ? "is less":"is big"; 
		System.out.println(a+":"+less);
        
	}

}
