package _04_Base64_Decoder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Base64;

public class Base64Decoder {
	/*
	 * Base 64 is a way of encoding binary data using text.
	 * Each number 0-63 is mapped to a character. 
	 * NOTE: THIS IS NOT THE SAME AS ASCII OR UNICODE ENCODING!
	 * Since the numbers 0 through 63 can be represented using 6 bits, 
	 * every four (4) characters will represent twenty four (24) bits of data.
	 * 4 * 6 = 24
	 * 
	 * For this exercise, we won't worry about what happens if the total bits being converted
	 * do not divide evenly by 24.
	 * 
	 * If one char is 8 bits, is this an efficient way of storing binary data?
	 * (hint: no)
	 * 
	 * It is, however, useful for things such as storing media data inside an HTML file (for web development),
	 * so that way a web site does not have to look for an image, sound, library, or whatever in a separate location.
	 * 
	 * View this link for a full description of Base64 encoding
	 * https://en.wikipedia.org/wiki/Base64
	 */

	
	final static char[] base64Chars = {
		'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 
		'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 
		'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd',
		'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
		'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 
		'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', 
		'8', '9', '+', '/'
	};
	
	//1. Complete this method so that it returns the the element in
	//   the base64Chars array that corresponds to the passed in char.
	public static byte convertBase64Char(char c){
		byte counter = 0;
		for (int i = 0; i < base64Chars.length; i++) {
			if(base64Chars[i] == c) {
			return counter;
			}else {
				counter ++;
			}
		}
		return 0;
	}
	
	//2. Complete this method so that it will take in a string that is 4 
	//   characters long and return an array of 3 bytes (24 bits). The byte  >>  | & ^
	//   array should be the binary value of the encoded characters.

	public static byte[] convert4CharsTo24Bits(String s){
		
	char[] chars = new char[4];
	int[] base64 = new int[4];
	String[] str = new String[4];
	for (int i = 0; i < s.length(); i++) {
		chars[i] = s.charAt(i);
	}
	for (int i = 0; i < chars.length; i++) {
		for (int j = 0; j < base64Chars.length; j++) {
			if(chars[i] == base64Chars[j]) {
				base64[i] = j;
			}
		}
	}

	for (int i = 0; i < base64.length; i++) {
		str[i] = Integer.toBinaryString(base64[i]);
		int shiftVal = 6 - str[i].length();

	
		
	}
	
	
		
		
	/*Base64Decoder decoder = new Base64Decoder();
	ArrayList<String> lett = new ArrayList<String>();
	ArrayList<Character> nums = new ArrayList<Character>();
	for (int i = 0; i < 4; i++) {
		lett.add(s.substring(i,i+1));
	}
	for (int i = 0; i < lett.size(); i++) {
	for (int j = 0; j < base64Chars.length; j++) {
	if(lett.get(i).equals(base64Chars[j])) {
	nums.add(base64Chars[j]);
	}
	}
	String all = "";
	for (int j = 0; j < nums.size(); j++) {
	all += "" + decoder.convertIntBinary(nums.get(i));
	}
	byte[] fin = {0,0,0};
	}*/
		
	
	return null;
	}
	
	//3. Complete this method so that it takes in a string of any length
	//   and returns the full byte array of the decoded base64 characters.
	public static byte[] base64StringToByteArray(String file) {
		byte[] c = Base64.getDecoder().decode(file);
		return c;
	}
	
	public int convertIntBinary(int n) {
		int ag = n;
		//System.out.println(ag);
		int num = 1;
		ArrayList<Integer> a = new ArrayList<Integer>(); 
		ArrayList<Integer> rev = new ArrayList<Integer>();
		ArrayList<Integer> binary = new ArrayList<Integer>();
		while(num <= n) {
		a.add(num);
		num = num*2;
		}
		for (int i = a.size()-1; i > -1; i--) {
			rev.add(a.get(i));
		}
		for (int i = 0; i < rev.size(); i++) {
		//System.out.println(ag);
		if(rev.get(i) <= ag) {
		binary.add(1);
		ag -= rev.get(i);
		}else {
		binary.add(0);
		}
		}
		String end = "";
		for (int i = 0; i < binary.size(); i++) {
		end += ""+binary.get(i);
		}
		int endI = Integer.parseInt(end);
		return endI;
	}
	
	}

