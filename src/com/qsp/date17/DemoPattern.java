package com.qsp.date17;

import java.util.Scanner;

public class DemoPattern {
//	public static void main(String[] args) {
//		System.out.println("Enter the number of row: ");
//		int n= new Scanner(System.in).nextInt();
//		for(int i=n;i>=1;i--) {
//			int val=1;
//			for(int j=i;j>=1;j--) {
//					System.out.print(val);
//					val++;
//			}
//			System.out.println();
//		}
//	}
	
//	public static void main(String[] args) {
//		System.out.println("Enter the number of row: ");
//		int n= new Scanner(System.in).nextInt();
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				if(i==1 || i+j==n+1 || j==1) {
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
//	}
	
//	public static void main(String[] args) {
//		System.out.println("Enter the number: ");
//			int n= new Scanner(System.in).nextInt();
//			int sum=1;
//			for(int i=n;i>0;i=i/10) {
//				sum=sum *(i%10);
//			}
//			System.out.println(sum);
//	}
	
	public static void main(String[] args) {
		System.out.println("Enter the number of row: ");
		int n= new Scanner(System.in).nextInt();
		int val=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(val+++"\t");
			}
			System.out.println();
		}
	}
}
