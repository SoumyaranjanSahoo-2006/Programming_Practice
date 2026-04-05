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

