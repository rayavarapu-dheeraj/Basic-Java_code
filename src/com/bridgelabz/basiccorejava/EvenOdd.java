package com.bridgelabz.basiccorejava;

import java.util.Scanner;

public class EvenOdd {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter a number: ");
		int num = s.nextInt();
		if (num % 2 == 0) {
			System.out.println(num + " is an even number.");
		} else {
			System.out.println(num + " is an odd number.");
		}
	}
}
