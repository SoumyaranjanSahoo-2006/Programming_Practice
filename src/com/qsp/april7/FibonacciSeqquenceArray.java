package com.qsp.april7;

import java.util.Arrays;

public class FibonacciSeqquenceArray {
	public static void main(String[] args) {
		solution(10);
	}
	static void solution(int n) {
		int a[]=new int [n];
		a[0]=0;
		a[1]=1;
		for(int i=2;i<a.length;i++) {
			a[i]=a[i-1]+a[i-2];
		}
		System.out.println(Arrays.toString(a));
	}
}
