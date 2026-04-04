package com.qsp.date20;

import java.util.Scanner;

public class GcdOfNumber {
	public static void main(String[] args) {
		System.out.println(findGcd(150, 625));
	}
	public static int findGcd(int a,int b) {
//		int min=a>b?b:a;
		int min= Math.min(a, b);
		for(int i=min;i>=1;i--) {
			if(a%i==0 && b%i==0) {
				return i;
			}
		}
		return 1;
	}
}


class GcdOfNumber2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int n1=sc.nextInt();
		System.out.println("Enter Second number");
		int n2=sc.nextInt();
		int res=findGcd(n1, n2);
		System.out.println("GCD of "+n1+ " and "+n2+" is "+res);
	}
	public static int findGcd(int n1,int n2) {
		int min=n1>n2?n2:n1;
		for(int i=min;i>=1;i--) {
			if(n1%i==0 && n2%i==0) {
				return i;
			}
		}
		return 1;
	}
}




class FindLcm {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int n1=sc.nextInt();
		System.out.println("Enter Second number");
		int n2=sc.nextInt();
		int res=findGcd(n1, n2);
		System.out.println("LCM of "+n1+ " and "+n2+" is "+res);
	}
	public static int findGcd(int n1,int n2) {
		int min=n1>n2?n2:n1;
		for(int i=min;i>=1;i--) {
			if(n1%i==0 && n2%i==0) {
				return i;
			}
		}
		return 1;
	}
	
	static int lcm(int n1,int n2) {
		return(n1*n2)/findGcd(n1,n2);
	}
}
