package com.qsp.april4;

import java.util.Arrays;

public class ReverseSentence {
	public static void main(String[] args) {
		String s="Java is easy";
		String res=reverse(s);
		System.out.println(res);
	}
	
	static String reverse(String s) {
		String sa[]=s.split(" ");
		System.out.println(Arrays.toString(sa));
		String res="";
		for(int i=sa.length-1;i>=0;i--) {
			res=res+sa[i];
			if(i==0) {
				continue;
			}
			res=res+" ";
		}
		return res;
	}
}

class ReveseWordOfSentence{
	public static void main(String[] args) {
		String s="Java full stack course";
		System.out.println(reverse(s));
	}
	static String reverse(String s) {
		String sa[]=s.split(" ");
		System.out.println(Arrays.toString(sa));
		String res="";
		for(int i=0;i<sa.length;i++) {
			String temp=reverseWord(sa[i]);
			res=res+temp;
			res=res+" ";
		}
		return res;
	}
	static String reverseWord(String word) {
		char ch[]=word.toCharArray();
		int i=0;
		int j=ch.length-1;
		while(i<j) {
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			i++;
			j--;
		}
		return new String(ch);
	}
}

//possible substring


class PossibleSubstring{
	public static void main(String[] args) {
		String s="malayalam";
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				System.out.println(s.substring(i,j));
			}
		}
	}
}

class AllPossibleSubstringPalindrome{
	public static void main(String[] args) {
		String s="malayalam";
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				String temp=s.substring(i,j);
				if(isPalindrome(temp)) {
					System.out.println(temp);
				}
			}
		}
	}
	
	static boolean isPalindrome(String s) {
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
}