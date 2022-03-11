package com.M_12;

public class Datatype {

	public static void main(String[] args) {
		
		int A;
		System.out.println("Size of Integer: A =  " + (Integer.SIZE/8) + " Bytes");
		byte B;
		System.out.println("Size of Byte : B =  " + (Byte.SIZE/8) + " Bytes");
		short S;
		System.out.println("Size of Short : S =  " + (Short.SIZE/8) + " Bytes");
		long L;
		System.out.println("Size of Long : L =  " + (Long.SIZE/8) + " Bytes");
		char C;
		System.out.println("Size of Char : C =  " + (Integer.SIZE/8) + " Bytes");
		float F;
		System.out.println("Size of Float : F =  " + (Integer.SIZE/8) + " Bytes");
		double D;
		System.out.println("Size of Double : D =  " + (Double.SIZE/8) + " Bytes"+"\n\n\n");
	
		// Also we check datatype size following ways:
		System.out.println("Also we check datatype size following ways:");
		System.out.println("Type          Size (bytes)");
        System.out.println("Character       " + Character.BYTES);
        System.out.println("Byte            " + Byte.BYTES);
        System.out.println("Integer         " + Integer.BYTES);
        System.out.println("Long            " + Long.BYTES);
        System.out.println("Short           " + Short.BYTES);
        System.out.println("Double          " + Double.BYTES);
        System.out.println("Float           " + Float.BYTES);
		
	}

}
