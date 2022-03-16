package com.ConditionalStatement;

import java.util.Scanner;

public class SwitchStatement {
public static void main(String[] args) {
	System.out.println("Arithmetic opearation using Switch");
	System.out.println("chooese operation");
	System.out.println("1.Addition");
	System.out.println("2.Subtraction");
	System.out.println("3.Multiplication");
	Scanner sc = new Scanner(System.in);
	int ch = sc.nextInt();
	switch(ch) {
	case 1:
		   System.out.println("1.Addition");
		   int a = sc.nextInt();
		   int b= sc.nextInt();
		   System.out.println("Addition Is:"+""+(a+b));
		   break;
	case 2: 
		   System.out.println("2.Substration");
		   int x = sc.nextInt();
		   int y= sc.nextInt();
		   System.out.println("Substration Is:"+""+(x-y));
		   break;
	case 3:
		   System.out.println("3.Multiplication");
		   int p = sc.nextInt();
		   int q= sc.nextInt();
		   System.out.println("Multiplication Is:"+""+(p*q));
		   break;
	default :
		System.out.println("Invalid option");
	}
	
	
}
}
