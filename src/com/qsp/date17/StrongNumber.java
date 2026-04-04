package com.qsp.date17;

import java.util.Scanner;

public class StrongNumber {
	public static void main(String[] args) {
		System.out.println("Enter a Number: ");
		int n=new Scanner(System.in).nextInt();
		boolean res=sol(n);
		System.out.println(res);
	}
	
	static boolean sol(int n) {
		int sum=0;
		int temp=n;
		while(n>0) {
			int rem=n%10;
			n/=10;
			sum=sum+fact(rem);
		}
		return temp==sum;
	}
	static int fact(int n) {
		if(n==0) return 1;
		return n*fact(n-1);
	}
}
