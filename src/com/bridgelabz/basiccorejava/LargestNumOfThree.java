package com.bridgelabz.basiccorejava;

import java.util.Scanner;

public class LargestNumOfThree {
 static	Scanner s = new Scanner(System.in);
	 public static void main(String[] args) {
	        System.out.println("Enter three numbers:: ");
	        int a = s.nextInt();
	        int b = s.nextInt();
	        int c = s.nextInt();
	        	if((a>b) && (a>c)){
	            System.out.println(a+" is the largest.");
	        }
	        else if((b>a) && (b>c)){
	            System.out.println(b+" is the largest.");
	        }
	        else{
	            System.out.println(c+" is the largest.");
	        }
	    }


}
