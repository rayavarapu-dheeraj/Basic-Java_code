package com.bridgelabz.basiccorejava;

import java.util.Scanner;

public class VowelConsonant {
	static Scanner s=new Scanner(System.in);
	public void findVowelOrNot(char ch){
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
	            System.out.println("Entered character "+ch+" is  Vowel"); 
		}
		else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
	            System.out.println("Entered character "+ch+" is Consonant");
		else
	            System.out.println("Not an alphabet");		
		}
	    public static void main(String[ ] arg){
		VowelConsonant c=new VowelConsonant();
		System.out.print("Enter a character : ");
		char n = s.next( ).charAt(0);	 		
		c.findVowelOrNot(n);
	    }

}
