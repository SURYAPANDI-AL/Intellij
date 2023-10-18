package com.string;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringFunctions {

	public static void main(String[] args) {
		/*
		 * understand all the string functions
		 * 
		 */

		String s1 = "myFirstString";
		String s2 = "mySecondString";

		// find length of the string
		System.out.println("length of the string : " + s1.length());

		// find the first occurrence the particular substring
		System.out.println("index of the first in the string is : " + s1.indexOf("First"));

		// the sting contains characters or not
		System.out.println("STATEMENT string 1 is empty : " + s1.isEmpty());

		// find the character at the specific index
		System.out.println("get the character at index 5: " + s1.charAt(5));

		// find the ASCII value of the current index
		System.out.println("get the ascii value of the char at 5th index: " + s1.codePointAt(5));

		// find the ASCII value of the character which placed before the index
		System.out.println("ascii value of the 5th index: " + s1.codePointBefore(6));

		// get the characters count in the given string
		System.out.println("get the count of characters in string : " + s1.codePointCount(0, s1.length()));

		System.out.println("get the  index from offset to the string : " + s1.offsetByCodePoints(2, 4));

		// get the byte array
		byte[] bytes = s1.getBytes();
		System.out.println(Arrays.toString(bytes));

		// get the bytes based on character set
		try {
			bytes = s1.getBytes("UTF-16BE");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Arrays.toString(bytes));

		// check the equality of the string
		System.out.println(s1.equals(s2));

		// it will through the following exception
//		String temp1=null;
//		String temp2=null;
//		System.out.println(temp1.equals(temp2));//
		/*
		 * Exception in thread "main" java.lang.NullPointerException: Cannot invoke
		 * "String.equals(Object)" because "temp1" is null at
		 * MentorAssignment/com.string.StringFunctions.main(StringFunctions.java:60)
		 * 
		 */
		
		//comparing based functions
		System.out.println(s1.contentEquals(s2));
		
		//here the parameter is stringbuffer
		StringBuffer sb = new StringBuffer(s1);
		System.out.println(s1.contentEquals(sb));
		
		System.out.println(s1.equalsIgnoreCase(s2));
		
		System.out.println(s1.compareTo(s2));
		
		System.out.println(s1.compareToIgnoreCase(s2));
		
		//comparing two substrings
		System.out.println("helloworld".regionMatches(2, "hello", 2, 3));
		//Ignoring the cases
		System.out.println("HELLOWORLD".regionMatches(true, 0, "heLLo", 0, 4));
		
		//string starts with .... the prefix
		System.out.println("hello".startsWith("l"));
		System.out.println("startswith");
		System.out.println(s1.startsWith("First",2));
		
		//String ends with.... the suffix
		System.out.println("connection".endsWith("tion"));
		
		//hashcode
		System.out.println(s1.hashCode());
		
		/*
		 * finding the index 
		 * 
		 */
		
		//character
		System.out.println(s1.indexOf('s'));
		System.out.println(s1.indexOf('s', 6));
		System.out.println(s1.lastIndexOf('s'));
		System.out.println(s1.lastIndexOf('s', 6));
		
		//String
		System.out.println(s1.indexOf("st"));
		System.out.println(s1.indexOf("st", 6));
		System.out.println(s1.lastIndexOf("st"));
		System.out.println(s1.lastIndexOf("st", 6));
		
		//substring
		System.out.println(s1.substring(5));
		System.out.println(s1.substring(5,8));
		System.out.println(s1.subSequence(5, 8));
		
		//concat
		System.out.println(s1.concat(s2));
		
		//replace the string
		System.out.println(s1.replace("st", "oo"));//string
		System.out.println(s1.replace('s', 'o'));//character
		
		//regex for replacement
		System.out.println("12345567890".replaceAll("[0-9]", "1"));
		System.out.println("abcd345567890".replaceFirst("[0-9]", "1"));
		System.out.println("surya".matches("[a-z]"));
		
		//check for the substring
		System.out.println(s1.contains("how"));
		
		//split
		String [] arr = "hello@world#Iwamwsuryapandi".split("[@#$%w]");
		System.out.println(Arrays.toString(arr));
		arr = "hello@world#Iwamwsuryapandi".split("[@#$%]",10);
		System.out.println(Arrays.toString(arr));
		
		//case changing
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println("    dhfbd   ".trim());
		
		System.out.println(Arrays.toString(s1.toCharArray()));
		
		
		//string valueOf() method
		System.out.println(String.valueOf(false));
		System.out.println(String.valueOf(1));
		System.out.println(String.valueOf('a'));
		System.out.println(String.valueOf(2.3f));
		System.out.println(String.valueOf(new char[]{'a','b','c'}));
		System.out.println(String.copyValueOf(new char[]{'a','b','c'}));
		System.out.println(String.copyValueOf(new char[]{'a','b','c'},0,2));
		
		//format
		System.out.println(String.format("string 1 = %s, \tstring 2 = %s", s1,s2));
		
		//intern
		/*
		 * When the intern method is invoked, if the pool already contains a 
		 * string equal to this String object as determined by the equals(Object) method, 
		 * then the string from the pool is returned. Otherwise, this String object is added to the pool 
		 * and a reference to this String object is returned.
		 * 
		 */
		System.out.println(s1.intern());
	}

}
