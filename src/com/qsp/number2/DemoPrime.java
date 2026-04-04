package com.qsp.number2;

import java.util.Scanner;

public class DemoPrime {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter lower limit ");
		int lower=sc.nextInt();
		System.out.println("Enter upper limit ");
		int upper=sc.nextInt();
		for(int i=lower;i<=upper;i++) {
			if(solution(i)) {
				System.out.println(i);
			}
		}
	}
	
	public static boolean solution(int n) {
		if(n<=1)
			return false;
		for (int i=2;i*i<=n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}
