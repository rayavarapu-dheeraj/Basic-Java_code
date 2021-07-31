package com.bridgelabz.basiccorejava;

import java.util.Scanner;

public class SwapNumber {
		 
	    public static void main(String[] args) {
	        System.out.print("Enter 2 numbers: ");
	        Scanner s = new Scanner (System.in);
	        int fno = s.nextInt();
	        int sno = s.nextInt();    
	        int t;
	        System.out.println("\nBefore swapping numbers: "+fno +"  "+ sno);    
	        t = fno;  
	        fno = sno;  
	        sno = t;  
	        System.out.println("After swapping: "+fno +"   " + sno);  
	          
	    }
}
