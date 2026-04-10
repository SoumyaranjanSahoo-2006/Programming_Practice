package com.qsp.april10;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int a[]= {1,3,4,5,7,8,10,12};
		System.out.println(solution(a, 9));
	}
	static int solution(int a[], int key) {
		int start=0;
		int end=a.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(a[mid]==key) {
				return mid;
			}
			else if(a[mid]<key) {
				start=mid+1;
			}
			else {
				end=mid-1;
			}
		}
		return -1;
	}
}


class SecondBiggestElementOfArray{
	public static void main(String[] args) {
		int a[]= {1,3,4,5,7,8,10,12};
		System.out.println(solution(a));
	}
	static int solution(int a[]) {
		Arrays.sort(a);
		int max=a[a.length-1];
		int secondmax=max;
		for(int i=a.length-2;i>=0;i--) {
			if(a[i]!=max) {
				secondmax=a[i];
				break;
			}
		}
		return secondmax;
	}
}