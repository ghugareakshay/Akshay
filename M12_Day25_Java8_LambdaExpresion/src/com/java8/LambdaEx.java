package com.java8;

public class LambdaEx {

	public interface Anonymous
	{
		void show();
	}
	public static void main(String[] args) 
	{
		/*Anonymous lambda = () -> {
			System.out.println("Hi Lambda Expression");
		};*/
             Anonymous lambda = () ->System.out.println("Hi Lambda Expression");
             lambda.show();
	}

}
