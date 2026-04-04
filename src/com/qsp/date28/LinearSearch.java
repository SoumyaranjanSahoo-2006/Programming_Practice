package com.qsp.date28;

import java.awt.Frame;
import java.util.Arrays;

public class LinearSearch {
	public static void main(String[] args) {
		int a[]= {4,2,6,1,5,8};
		System.out.println(indexOf(a, 5));
		System.out.println(lastIndexOf(a,6));
	}
	static int indexOf(int a[], int key) {
		for (int i=0;i<a.length;i++) {
			if(a[i]==key) {
				return i;
			}
		}
		return -1;
	}
	
	static int lastIndexOf(int a[], int key) {
		for (int i=a.length-1;i>=0;i--) {
			if(a[i]==key) {
				return i;
			}
		}
		return -1;
	}
}


//====================================================================================


class UpdateArrayElement{
	public static void main(String[] args) {
		int a[]= {9,2,6,0,4,2,6,1};
		System.out.println(Arrays.toString(a));
		updateElement(a, 2, 10);
		System.out.println(Arrays.toString(a));
	}
	
	static int[] updateElement(int a[],int oldElement,int newElement) {
		int temp[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			temp[i]=a[i];
		}
		for (int i=0;i<a.length;i++) {
			if(a[i]==oldElement) {
				a[i]=newElement;
			}
		}
		return temp;
	}
}

//==========================================================================
class AddElementinArray{
	public static void main(String[] args) {
		int a[]= {4,6,2,4,3};
		System.out.println(Arrays.toString(a));
		int res[]=addElementAtEnd(a, 20);
		System.out.println(Arrays.toString(res));
	}
	static int[] addElementAtEnd(int a[],int newElement){
		int temp[]=new int[a.length+1];
		for(int i=0;i<a.length;i++) {
			temp[i]=a[i];
		}
		temp[a.length]=newElement;
		return temp;
	}
}

//===========================================================================================


