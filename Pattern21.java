package com.java.prog;

public class Pattern21
{
	public static void main(String[] args)
	{
		for (int i = 0; i <= 5; i++)
		{
			int alphabet = 65;
			for (int j = 5; j > i; j--)
			{
				System.out.print('A' + " ");
			}

			for (int k = 0; k <= i; k++)
			{
				System.out.print((char) (alphabet + i) + " ");
			}
			System.out.println();
		}
	}
}