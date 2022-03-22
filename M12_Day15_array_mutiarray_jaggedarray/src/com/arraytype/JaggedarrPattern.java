package com.arraytype;

public class JaggedarrPattern {

	public static void main(String[] args) {
		String jagarr[ ] [ ] = new String [3] [];
		
		jagarr[0]=new String[] {"  ","*"};
		jagarr[1]=new String[] {" *"," *"};
		jagarr[2]=new String[] {"*"," *"," *"};
		
		for(int i=0;i<jagarr.length;i++) {
			for(int j=0;j<jagarr[i].length;j++) {
				System.out.print(jagarr[i][j]);
			}
			System.out.println();
		}

		
	}

}
