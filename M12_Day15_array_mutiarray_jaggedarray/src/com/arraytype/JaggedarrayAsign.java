package com.arraytype;

public class JaggedarrayAsign {
public static void main(String[] args) {
	int jagarr[ ] [ ] = new int [3] [];
	
	jagarr[0]=new int[] {4,5,6};
	jagarr[1]=new int[] {3};
	jagarr[2]=new int[] {1,2,4};
	
	for(int i=0;i<jagarr.length;i++) {
		for(int j=0;j<jagarr[i].length;j++) {
			System.out.print(jagarr[i][j]);
		}
		System.out.println();
	}
}
}
