package com.java.prog;

public class ASample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 5;
		for (int c = 1; c <= rows; c++) 
		{ 
			for (int j = rows; j > c; j--)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= (c * 2) - 1; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
