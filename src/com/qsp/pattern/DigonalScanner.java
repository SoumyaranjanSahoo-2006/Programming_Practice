package com.qsp.pattern;

import java.util.Scanner;

public class DigonalScanner {
	public static void main(String[] args) {
		System.out.println("Enter number of row- ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1 || i==n || j==1 || j==n || j+i==n+1 || i==j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
