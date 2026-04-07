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


class KeyEncoding{
	public static void main(String[] args) {
		String s="abcdestuvwxyz";
		String res=solution(s,3);
		System.out.println(res);
	}
	static String solution(String s,int key) {
		String res="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			char temp=(char)(ch+key);
			if(temp>'z') {
				int used='z'-ch;
				int pending=key-used;
				temp=(char)(96+pending);
			}
			res=res+temp;
		}
		return res;
	}
}