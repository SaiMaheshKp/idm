package com.java.prog;

public class Pattern27
{
	public static void main(String[] args)
	{
		for (int i = 0; i < 5; i++)
		{
			int alphabet = 65;
			for (int j = 0; j < 5; j++)
			{
				System.out.print((char) (alphabet + i+j));
			}
			System.out.println();
		}
	}
}