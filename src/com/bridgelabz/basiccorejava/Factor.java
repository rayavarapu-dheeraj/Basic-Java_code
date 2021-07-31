package com.bridgelabz.basiccorejava;

import java.util.Scanner;

public class Factor {
    public static void primeFactors(int n)
    {
        while (n%2==0)
        {
            System.out.print(2 + " ");
            n /= 2;
        }
        for (int i = 3; i <= Math.sqrt(n); i+= 2)
        {
            while (n%i == 0)
            {
                System.out.print(i + " ");
                n /= i;
            }
        }
        if (n > 2)
            System.out.print(n);
    }
    final static Scanner s = new Scanner(System.in);
    public static void main (String[] args)
    {
        
        System.out.println("Enter a number: ");
        int n = s.nextInt();
        primeFactors(n);
    }
}