package com.qsp.date16;

public class FibonacciSequence {
	public static void main(String[] args) {
		fibonacci(10);
	}
	static void fibonacci(int n) {
		int a=0;
		int b=1;
		for(int i=1;i<=n;i++) {
			System.out.println(a);
			int c=a+b;
			a=b;
			b=c;
		}
	}
}
