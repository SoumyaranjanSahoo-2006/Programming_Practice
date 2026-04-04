package com.qsp.date26;

import java.util.Arrays;

public class MaximumElementofArray {
	public static void main(String[] args) {
		int a[]= {2,3,9,1,5,6};
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		int result=max(a);
		System.out.println( "Maximum element of the array is "+result);
	}
	static int max(int a[]) {
		int max=Integer.MIN_VALUE; //pigeon hole principle
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		return max;
	}
}




class MaximumElementofArray2 {
	public static void main(String[] args) {
		int a[]= {2,3,9,1,5,6};
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		int result=max(a);
		System.out.println( "Maximum element of the array is "+result);
	}
	static int max(int a[]) {
		int max=Integer.MIN_VALUE; //pigeon hole principle
		for(int x:a) {
			if(x>max) {
				max=x;
			}
		}
		return max;
	}
}

//=========================================================================================

class MinimumElementofArray{
	public static void main(String[] args) {
		int a[]= {2,3,9,1,5,6};
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		int result=min(a);
		System.out.println( "Minimum element of the array is "+result);
	}
	static int min(int a[]) {
		int min=Integer.MAX_VALUE; //pigeon hole principle
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		return min;
	}
}


//==============================================================================================

class MissingNumber{
	public static void main(String[] args) {
		int a[]= {2,4,1,5,3,7,9,8};
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		int result=missing(a);
		System.out.println( "Missing element of the array is "+result);
	}
	
	static int max(int a[]) {
		int max=Integer.MIN_VALUE; //pigeon hole principle
		for(int x:a) {
			if(x>max) {
				max=x;
			}
		}
		return max;
	}
	static int missing(int a[]) {
		int n=max(a);
		int expected=(n* (n+1))/2;
		int actual=0;
		for(int x:a) {
			actual+=x;
		}
		int res=expected-actual;
		return res;
	}
}

//=================================================================================================


class SplitArray{
	public static void main(String[] args) {
		int a[]= {5,2,6,1,4,3,1,6,0};
		split(a);
	}
	static void split(int a[]) {
		int left[]=new int[a.length/2];
		int right[]= new int[a.length-left.length];
		
		for(int i=0;i<left.length;i++) {
			left[i]=a[i];
		}
		
		for(int j=0;j<right.length;j++) {
			right[j]=a[j+left.length];
		}
		System.out.println(Arrays.toString(left));
		System.out.println(Arrays.toString(right));
	}
}