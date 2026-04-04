package com.qsp.april3;

import java.util.Arrays;

//WAJP to find out frequency of each character in a string.
//The String contains only lower case character.

public class FrequencyOfEachCharacter {
	public static void main(String[] args) {
		solution("abcdefabghkij");;
		
	}
	static void solution(String s) {
		int a[]=new int[26];
		for(int i=0;i<s.length();i++) {
			int index=s.charAt(i)-'a';
			a[index]++;
		}
		System.out.println(Arrays.toString(a));
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==0) continue;
			System.out.println((char) (i+'a')+" "+a[i]);
		}
	}
}


//======================================================================================

class PnagramString {
    public static void main(String[] args) {
		String s="qwertyuioplkjhgfdsazxcvbnm";
		System.out.println(isPanagram(s));
	}
    static boolean isPanagram(String s) {
    	int a[]=new int[26];
    	for(int i=0;i<s.length();i++) {
			int index=s.charAt(i)-'a';
			a[index]++;
		}
   	 for(int x:a) {
   		 if(x==0) {
   			 System.out.println("The String is not a Panagram.");
   			 return false;
   		 }
   	 }
   	 System.out.println("The String is a Panagram.");
   	 return true;
    }
}


//=============================================================

//WAJP to find out frequency of each Number in a array.

class FrequencyOfNumber{
	public static void main(String[] args) {
		int a[]= {1,2,9,6,0,4,2,6,1};
		solution(a);
	}
	static void solution(int a[]) {
		int f[]=new int[1001];
		for(int i=0;i<a.length;i++) {
			int index=a[i];
			f[index]++;
		}
		for(int i=0;i<f.length;i++) {
			if(f[i]==0) continue;
				System.out.println(i+" "+f[i]);
		}
	}
}

//WAJP to check out two given string Anagram of eachother or not.
class AnagramString{
	public static void main(String[] args) {
		String s1="ababcdef";
		String s2="eacfbdab";
		System.out.println(solution(s1, s2));
	}
	static boolean solution(String s1, String s2) {
		if(s1.length()!=s2.length()) {
			return false;
		}
		int a[]=new int[26];
		int b[]=new int[26];
		for(int i=0;i<s1.length();i++) {
			int index1=s1.charAt(i)-'a';
			a[index1]++;
			int index2=s2.charAt(i)-'a';
			b[index2]++;
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		for(int i=0;i<a.length;i++) {
			if(a[i]!=b[i]) {
				return false;
			}
		}
		return true;
	}
}
