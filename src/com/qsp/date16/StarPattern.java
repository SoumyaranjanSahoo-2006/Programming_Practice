package com.qsp.date16;

import java.util.Scanner;

public class StarPattern {
	public static void main(String[] args) {
		System.out.println("Enter the number of row: ");
		int n= new Scanner(System.in).nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
