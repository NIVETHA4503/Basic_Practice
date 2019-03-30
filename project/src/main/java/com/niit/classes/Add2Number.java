package com.niit.classes;

import java.util.Scanner;

public class Add2Number {
	public static void main(String args[]) {
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter the 1st number to add:");
	    int i=sobj.nextInt();
	    System.out.println("Enter the 1st number to add:");
	    int j=sobj.nextInt();
	    int sum=i+j;
	    System.out.println("The sum of the two number is:"+sum);
	}

}
