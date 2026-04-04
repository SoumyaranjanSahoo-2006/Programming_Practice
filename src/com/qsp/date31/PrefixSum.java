package com.qsp.date31;

import java.util.Arrays;

public class PrefixSum {
	public static void main(String[] args) {
		int a[]= {9,2,6,0,4,2};
		solution(a);
		System.out.println(Arrays.toString(a));
	}
	static void solution(int a[]) {
		for(int i=1;i<a.length;i++) {
			a[i]=a[i]+a[i-1];
		}
	}
}


class DigitSum{
	public static void main(String[] args) {
		String s="h12e5l2l5o7";
		digitSum(s);
	}
	static int digitSum(String s) {
		int sum=0;
		for(int i=0;i<s.length();i++) {
//			System.out.println(s.charAt(i));
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9') {
				System.out.println(ch);
//				sum=sum+ch-'0';
				sum=sum+ch-48;
			}
		}
		System.out.println(sum);
		return 0;
	}
}

class VowelCount{
	public static void main(String[] args) {
		String s="hello world";
		int res=sol(s);
		System.out.println(res);
		System.out.println(s.length()-res);
	}
	static int sol(String s) {
		int count=0;
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a' ||ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				count++;
			}
		}
		return count ;
	}
}

class Count{
	public static void main(String[] args) {
		String s="h1@ellAB#$4c";
		solution(s);
	}
	static int solution(String s) {
		int uppercase=0;
		int lowercase=0;
		int digit=0;
		int special=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='a' && ch<='z') {
				lowercase++;
			}
			else if(ch>='A' && ch<='Z'){
				uppercase++;
			}
			else if(ch>='0' && ch<='9'){
				digit++;
			}
			else {
				special++;
			}
		}
		return special;
	}
}