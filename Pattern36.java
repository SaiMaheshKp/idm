package com.java.prog;

import java.util.Scanner;

public class Pattern36
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows needed to in the pattern ");

        int rows = scanner.nextInt();

        int alphabet = 65;
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < rows; j++)
            {
                if (j % 2 == 0)
                    System.out.print((char) (alphabet + (rows * (j)) + i) + " ");
                else
                    System.out.print((char) (alphabet + (rows * (j + 1)) - i - 1) + " ");
            }
            System.out.print("\n");
        }
    }
}
