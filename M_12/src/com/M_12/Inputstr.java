package com.M_12;

import java.io.*;
public class Inputstr 
{

	public static void main(String[] args) throws IOException{
		
		//create an object for InputStreamReader
		
		InputStreamReader is=new InputStreamReader(System.in);
		System.out.println("Enter numbeer");

		BufferedReader br=new BufferedReader(is);
		int num=Integer.parseInt(br.readLine());
		System.out.println("you have entered" +num);
		

	}

}
