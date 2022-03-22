package com.arraytype;

import java.util.Scanner;

public class MultiDimentionArray {

	public static void main(String[] args) {
		System.out.println("its my own way to print multidimention array in tabular form means(rows && columan)");
		int TwoDiem[ ] [ ] = new int [3] [3];
		//first row assign 
		TwoDiem[0][0]=1;   
		TwoDiem[0][1]=2;
		TwoDiem[0][2]=3;
		
		//second row assign
		TwoDiem[1][0]=4;
		TwoDiem[1][1]=5;
		TwoDiem[1][2]=6;
		
		//third row assign
		TwoDiem[2][0]=7;
		TwoDiem[2][1]=8;
		TwoDiem[2][2]=9;
		
		for(int i =0; i<3; i++)  // index
		{
		 for(int j=0; j<3; j++)   //get values
		 {
		 System.out.print(TwoDiem[i][j]);
		 }
		 System.out.println();
		}

		
		/*int arr1[][] = new int[3][3];
		int arr[][]= {{2,7,9},{3,6,1},{7,4,2}};
		arr[0]=new int[3];
		arr[1]=new int[3];
		arr[2]=new int[3];
		
		
		//System.out.println(arr[0][1]);
		/*get hash code
		 * System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		*/
		
		/* for(int i=0;i<arr.length;i++)
	        {
	        	for(int j=0;j<arr1.length;j++)
	        	{
	        		System.out.print(arr[i][j]);
	        	}System.out.println();
	        }
*/
	}
}

