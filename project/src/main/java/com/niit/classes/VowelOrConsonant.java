package com.niit.classes;

import java.util.Scanner;

public class VowelOrConsonant {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the alphabet");
		char alp=s.next().charAt(0);
		if(alp=='a'|| alp=='e' ||alp=='i'|| alp=='o'|| alp=='u') {
			System.out.println("vowel");
			
		}else {
			System.out.println("not vowel");
			
		}
		
	}

}
