package com.qsp.date19;

public class AmstrongNumber {
	public static void main(String[] args) {
		System.out.println(isArmStrong(153));
	}
	static boolean isArmStrong(int n) {
		int digitCount=numberOfDigit(n); // method call number of digit
		int temp=n;
		int sum=0;
		while(n>0) {
			int rem=n%10;
			sum=sum+power(rem,digitCount); //power sum
			n=n/10;
		}
		return temp==sum;
	}
	static int numberOfDigit(int n) {
		int count=0;
		while(n>0) {
			n/=10;
			count++;
		}
		return count;
	}
	static int power(int n, int y) {
		int res=1;
		for(int i=1;i<=y;i++) {
			res=res*n;
		}
		return res;
	}
}
