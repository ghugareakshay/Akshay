package com.arraytype;

public class JaggedArray {

	public static void main(String[] args) {
		
		int jagarr[ ] [ ] = new int [3] [];
		
		jagarr[0]=new int[3];
		jagarr[1]=new int[1];
		jagarr[2]=new int[2];
		
		for(int i=0;i<jagarr.length;i++) {
			for(int j=0;j<jagarr[i].length;j++) {
				System.out.print(jagarr[i][j]);
			}
			System.out.println();
		}
		
	}

}
