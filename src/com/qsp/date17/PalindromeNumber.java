package com.qsp.date17;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		System.out.println("Enter a Number: ");
		int n=new Scanner(System.in).nextInt();
		System.out.println(solution(n));
	}
	static boolean solution(int n) {
		int rev=0;
		int temp=n;
		while (n>0) {
			int rem=n%10;
			n=n/10;
			rev=(rev*10)+rem;
		}
		return rev==temp;
		
	}
}
