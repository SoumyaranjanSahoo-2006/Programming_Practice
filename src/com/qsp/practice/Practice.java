package com.qsp.practice;

//import java.util.Scanner;

public class Practice {

//	public static void main(String[] args) {
//		System.out.println("Enter number: ");
//		Scanner sc= new Scanner(System.in);
//		int n=sc.nextInt();
//		int reverse=0;
//		while(n>0) {
//			reverse=reverse*10 + (n%10);
//			n=n/10;
//		}
//		System.out.println(reverse);
//	}
	
	public static void main(String[] args) {
		int n=12345;
		int count=0;
		for(int i=1;i<=n;i=n/10) {
			count++;
		}
		System.out.println(count);
	}

}
