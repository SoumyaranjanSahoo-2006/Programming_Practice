package com.qsp.number;

import java.util.Scanner;

public class DivisorNumber_2 {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i*i<=n;i++) {
			if(n%i==0) {
				sum+=i;
				System.out.println(i);
				if(n/i!=i) {
					System.out.println(n/i);
					sum=sum+(n/i);
				}
			}
		}
		System.out.println("sum= "+sum);
		sc.close();
	}
} 
