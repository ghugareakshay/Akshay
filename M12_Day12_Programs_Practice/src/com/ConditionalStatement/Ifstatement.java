package com.ConditionalStatement;

import java.util.Scanner;

public class Ifstatement {

	public static void main(String[] args) {
		System.out.println("Enter the Number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a<10) {
			System.out.println(a+":Is Less than 10");
		}

	}

}
