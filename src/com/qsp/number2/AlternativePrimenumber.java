package com.qsp.number2;

public class AlternativePrimenumber {
	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=100;i++) {
			if(solution(i)) {
				count++;
				if(count%2==1) {
					System.out.println(i);
				}
			}
		}
	}
	
	public static boolean solution(int n) {
		if(n<=1)
			return false;
		for (int i=2;i*i<=n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}
