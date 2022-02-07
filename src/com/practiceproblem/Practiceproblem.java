package com.practiceproblem;

import java.util.Scanner;

public class Practiceproblem {
	public static void main(String[] args) {
		System.out.println("Enter Number");
			try (Scanner input = new Scanner (System.in)) {
				int digit = input.nextInt();
				if( digit % 2 == 0 )
				System.out.println("digit is even");
				else
				System.out.println("digit is odd");
			}
			
	}
}