package com.qsp.number2;

import java.util.Scanner;

// Write a program to check in between one to 100 which one is prime and which one is not prime?

public class PrimeNumber {
	
	public static boolean solution(int n) {
		if(n<=1)return false;
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int count=0;
		for(int i=100;i>=1;i--) {
			if(solution(i)) {
				System.out.println(i);
				count++;
			}
			
		}
		System.out.println("No of prime "+count);
		System.out.println("No of non prime "+(100-count));
	}
}
