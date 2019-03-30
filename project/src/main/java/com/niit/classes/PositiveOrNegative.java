package com.niit.classes;

import java.util.Scanner;

public class PositiveOrNegative {
public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number to check:");
	int num=s.nextInt();
	if(num==0) {
		System.out.println("Enter any other number");
	}else 
		if(num>0) {
			System.out.println("Positive Number");
			
		}
		else
			if(num<0) {
				System.out.println("Negative Number");
			}
	
}
}
