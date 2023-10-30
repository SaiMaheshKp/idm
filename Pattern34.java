package com.java.prog;

import java.util.Scanner;

public class Pattern34
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows needed to in the pattern ");

        int rows = scanner.nextInt();

        int alphabet = 65;
        int temp = 1;
        for (int i = 1; i <= rows / 2 + 1; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print((char) (alphabet + (temp * j) - 1) + " ");
            }
            System.out.println();
            temp++;
        }
        for (int i = 1; i <= rows / 2; i++)
        {
            for (int j = 1; j <= rows / 2 + 1 - i; j++)
            {
                System.out.print((char) (alphabet + (temp * j) - 1) + " ");

            }
            System.out.println();
            temp++;
        }
    }
}
