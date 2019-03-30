package com.niit.classes;

public class LargeNumAmongThree {
public static void main(String args[]) {
	int first=981;
	int second=45123;
	int third=456;
	if(first>second && first>third ) {
		System.out.println("The largest number is:"+first);
	}else 
		if(second>first && second>third ) {
			System.out.println("The largest number is:"+second);
		}else 
			System.out.println("The largest number is:"+third);
	
}
}
