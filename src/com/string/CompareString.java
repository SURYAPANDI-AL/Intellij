package com.string;

import java.util.Scanner;

public class CompareString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next(), s2 = sc.next();
		int result=compareWithCase(s1, s2);
		resultDescription(result);
		result =compareWithOutCase(s1, s2);
		resultDescription(result);
	}

	private static int compareWithOutCase(String s1, String s2) {
		//s1.compareToIgnoreCase(s2);
		int length1 = s1.length();
		int length2 = s2.length();
		int loop_length = (length1 < length2) ? length1 : length2;
		for (int i = 0; i < loop_length; i++) {
			int ascii_value_char1 = s1.charAt(i);
			int ascii_value_char2 = s2.charAt(i);
			ascii_value_char1 += (ascii_value_char1 >= 65 && ascii_value_char1 <= 90) ? 32 : 0;
			ascii_value_char2 += (ascii_value_char2 >= 65 && ascii_value_char2 <= 90) ? 32 : 0;
			if (ascii_value_char1 != ascii_value_char2) {
				return ascii_value_char1 - ascii_value_char2;
			} 
		}
		if (length1>length2) {
			return 1;
		} else if (length1<length2) {
			return-1;
		}
		return 0;
	}

	private static int compareWithCase(String s1, String s2) {
		//s1.compareTo(s2);
		int length1 = s1.length();
		int length2 = s2.length();
		int loop_length = (length1 < length2) ? length1 : length2;
		for (int i = 0; i < loop_length; i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				return s1.charAt(i) - s2.charAt(i);
			}
		}
		if (length1>length2) {
			return 1;
		} else if (length1<length2) {
			return-1;
		}
		return 0;
	}
	private static void resultDescription(int result) {
		if(result>0)
			System.out.println("string one is greater than string two.");
		else if(result<0)
			System.out.println("string one is smaller than string two.");
		else
			System.out.println("both strings are equal.");		
	}
}
