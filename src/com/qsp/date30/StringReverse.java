package com.qsp.date30;

import java.util.Arrays;

public class StringReverse {
	public static void main(String[] args) {
		String s="maximum";
		System.out.println(reverse(s));
	}
	static String reverse(String s) {
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			char ch=s.charAt(i);
			rev=rev+ch;
		}
		return rev;
	}
	
}

class ReverseArray{
	public static void main(String[] args) {
		int a[]= {4,5,9,1,6,2,8};
		reverseArray(a);
		System.out.println(Arrays.toString(a));
	}
	static void reverseArray(int a[]) {
		int i=0;
		int j=a.length-1;
		while(i<j) {
			//swap
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
	}
}


class Pallindrome{
	public static void main(String[] args) {
		String s="malayalam";
		char[]ch=s.toCharArray();
		System.out.println(reverse(s));
		System.out.println(isPallindrome(s));
	}
//	static boolean isPallindrome(String s) {
//		String rev=reverse(s);
//		return rev.equals(s);
//	}
	static boolean isPallindrome(String s) {
		int i=0;
		int j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	static String reverse(String s) {
		char ch[]=s.toCharArray();
		//TODO ch[] reverse
		int i=0;
		int j=ch.length-1;
		while(i<j) {
			//swap
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			i++;
			j--;
		}
		//TODO make ch into String
		return new String(ch);
	}
}


class UniCode{
	public static void main(String[] args) {
		for(int i=1;i<=130;i++) {
			System.out.println(i+" "+(char)(i));
		}
	}
}