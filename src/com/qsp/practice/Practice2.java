package com.qsp.practice;

public class Practice2 {
	public static void main(String[] args) {
		int sum=0;
		for(int i=1345632;i>0;i=i/10) {
			sum=sum+(i%10);
		}
		System.out.println(sum);
	}
}
