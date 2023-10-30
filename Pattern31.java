package com.java.prog;

import java.util.Scanner;

public class Pattern31
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows needed to in the pattern ");

        int rows = scanner.nextInt();

        int temp = (rows * (rows - 1)) / 2;
        int alphabet = 65;

        for (int i = 1; i < rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print((char) (alphabet + temp - 1) + " ");
                temp--;
            }
            System.out.println();
        }
    }
}
