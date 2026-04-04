package com.qsp.number;

import java.util.Scanner;

public class PrintDivisor {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
		System.out.println(n);
	}
}
