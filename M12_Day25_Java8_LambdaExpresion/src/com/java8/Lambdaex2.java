package com.java8;

public class Lambdaex2 {

	public interface Addition
	{
		int add(int x ,int y);
	}
	public static void main(String[] args) 
	{
		Addition lam = (a,b) ->{return (a+b);};
        
		System.out.println(lam.add(12,13));

	}
}
