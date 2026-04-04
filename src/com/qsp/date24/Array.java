package com.qsp.date24;


import java.util.Iterator;
import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		int a[]=new int[5]; 
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter element number "+(i+1));
			a[i]=sc.nextInt();
		}
		System.out.println("-------------------------------------");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}


//
//class Arrays {
//	public static void main(String[] args) {
//		int a[]=new int[5]; 
//		Scanner sc= new Scanner(System.in);
//		for(int i=0;i<a.length;i++) {
//			System.out.println("Enter element number "+(i+1));
//			a[i]=sc.nextInt();
//		}
//		System.out.println("-------------------------------------");
//		String res=Arrays.toString(a);
//		System.out.println(res);
//	}
//}







class Foreach{
	public static void main(String[] args) {
		int a[]= {9,2,6,0,4,1};
		for (int x:a) {
			System.out.println(x);
		}
	}
}


class SumofArray{
	public static void main(String[] args) {
		int a[]= {9,2,6,0,4,1};
		int sum=0;
		for (int x:a) {
			sum+=x;
		}
		System.out.println(sum);
	}
}


class MultiplyofArray{
	public static void main(String[] args) {
		int a[]= {9,2,6,3,4,1};
		int multiply=1;
		for (int x:a) {
			multiply*=x;
		}
//		for(int i=0;i<a.length;i++) {
//			multiply*=a[i];
//		}
		System.out.println(multiply);
	}
}


class OddEvenSum{
	public static void main(String[] args) {
		int a[]= {5,2,9,6,2,7};
		System.out.println(diffSum(a));
	}
	static int diffSum(int a[]) {
		int evensum=0;
		int oddsum=0;
		for(int x:a) {
			if(x%2==0) {
				evensum+=x;
			}
			else {
				oddsum+=x;
			}
		}
		return oddsum-evensum;
	}
}


class PrimeNumberOfanArray{
	public static void main(String[] args) {
		int a[]= {5,2,9,6,2,7};
		printPrimes(a);
	}
	
	public static void printPrimes(int a[]) {
		for(int x:a) {
			if(findPrimenum(x)) {
				System.out.println(x);
			}
		}
	}
	static boolean findPrimenum(int n) {
		if(n<=1)return false;
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true ;
	}
}

//===================================================================================================


class FactorialArray{
	public static void main(String[] args) {
		int a[]= {5,2,9,6,2,7};
		printFact(a);
	}
	
	static void printFact(int a[]) {
		for(int x:a) {
			System.out.println(factorial(x));
		}
	}
	static int factorial(int n) {
		if(n==0)return 1;
		return n*factorial(n-1);
	}
}