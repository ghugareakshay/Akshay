package com.arraytype;

public class Array {

	public static void main(String[] args) {
		System.out.println("Single dimention array:");
		int arr[]=new int[3];
		arr[0]=3;
		arr[1]=2;
		arr[2]=1;
		
		/*System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		*/
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}

	}

}
