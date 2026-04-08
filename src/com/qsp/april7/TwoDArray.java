package com.qsp.april7;

import java.util.Arrays;

public class TwoDArray {
	public static void main(String[] args) {
		int a[][]= {
				{2,3,4},
				{6,2,1,7},
				{5,2,1}
		};
//		for(int b[]:a) {
//			for(int x:b) {
//				System.out.print(x+" ");
//			}
//			System.out.println();
//		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}


class TwoDArray2{
	public static void main(String[] args) {
		int n=5;
		int a[][]= new int[n][];
		for(int i=0;i<a.length;i++) {
			a[i]=new int[i+1];
			for(int j=0;j<a[i].length;j++) {
				if(j==0 || j==a[i].length-1) {
					a[i][j]=1;
				}
			}
		}
		
		for(int x[]:a) {
			System.out.println(Arrays.toString(x));
		}
	}
}
