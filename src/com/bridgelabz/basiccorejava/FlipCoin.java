package com.bridgelabz.basiccorejava;
import java.util.Scanner;

public class FlipCoin {
    static final Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Flip coin times: ");
        
        int num = s.nextInt();
        int count=0;
        int hCount=0;
        int tCount=0;
        double hPer;
        double tPer;
        while(num!=count){
            
            if(Math.random() < 0.5){
                System.out.println("Tails");
                tCount++;    
            }
            else{
                System.out.println("Heads");
                hCount++;
            }
        count++;
        }
        tPer=(tCount/num)*100;
        hPer=(hCount/num)*100;
        System.out.println("Tails: "+tCount);
        System.out.println("Heads: "+hCount);
        System.out.format("Tails percentage: %.2f",tPer);
        System.out.format("\nHeads percentage: %.2f",hPer);
    }
}

