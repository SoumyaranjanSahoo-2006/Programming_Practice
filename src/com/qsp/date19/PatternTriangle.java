package com.qsp.date19;

import java.util.Scanner;

public class PatternTriangle {
	public static void main(String[] args) {
		System.out.println("Enter the number of row: ");
		int n= new Scanner(System.in).nextInt();
		int space=0;
		int star=(n*2)-1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++) {
				if(i==n || i==1 || k==1 ||k==star )
					System.out.print("*");
					else {
						System.out.print(" ");
					}

			}
			space++;
			star-=2;
			System.out.println();
		}
	}

}
