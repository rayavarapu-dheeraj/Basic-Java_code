package com.bridgelabz.basiccorejava;
import java.util.Scanner;
public class PowerOfTwo {
	static final Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a number of the power: ");

        int n = s.nextInt();
        int x = 2;
        System.out.println(x);
        for (int i = 1; i <= n - 1; i++) {
            x = (x * 2);
            System.out.println(x);
        }
    }
}

