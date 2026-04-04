package com.qsp.date20;

import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {
		System.out.println("Enter the number of row: ");
		int n= new Scanner(System.in).nextInt();
		int space=n-1;
		int star=1;
		for(int i=1;i<=(2*n-1);i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++) {
				System.out.print("*");
			}
			if(i<n) {
				space--;
				star+=2;
			}
			else {
				space++;
				star-=2;
			}
			System.out.println();
		}
	}
}

class SpyNumber{
	public static void main(String[] args) {
		System.out.println(isSpy(123));
	}
	static boolean isSpy(int n) {
		int sum=0;
		int multiply=1;
		while(n>0) {
			int rem=n%10;
			n/=10;
			sum+=rem;
			multiply*=rem;
		}
		return sum==multiply;
	}
}