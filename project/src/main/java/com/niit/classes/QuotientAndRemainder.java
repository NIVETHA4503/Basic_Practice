package com.niit.classes;

import java.util.Scanner;

public class QuotientAndRemainder {
	public static void main(String []args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int first=s.nextInt();
		System.out.println("Enter the second number:");
		int second=s.nextInt();
		double quo=first/second;
		System.out.println(quo);
		
		
		int rem=first%second;
		System.out.println(rem);
	}
	
	}

