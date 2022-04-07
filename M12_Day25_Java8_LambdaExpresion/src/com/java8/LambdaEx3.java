package com.java8;

public class LambdaEx3 {

	public interface Casesecond
	{
		int add(int x ,int y);
	}
	public static void main(String[] args) 
	{
	   Casesecond lam = (a,b) -> (a+b);
        
		System.out.println(lam.add(12,13));

	}
}
