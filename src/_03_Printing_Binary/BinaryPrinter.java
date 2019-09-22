package _03_Printing_Binary;

import java.util.ArrayList;

public class BinaryPrinter {
	//Complete the methods below so they print the passed in parameter in binary.
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	public static void main(String[] args) {
		byte a = 17;
		short e = 56;
		int w = 834;
		long f = 34398453;
		BinaryPrinter bp = new BinaryPrinter();
		bp.printByteBinary(a);
		bp.printShortBinary(e);
		bp.printIntBinary(w);
		bp.printLongBinary(f);
	
	}
	public void printByteBinary(byte b) {
	int ag = b;
	//System.out.println(ag);
	int num = 1;
	ArrayList<Integer> a = new ArrayList<Integer>(); 
	ArrayList<Integer> rev = new ArrayList<Integer>();
	ArrayList<Integer> binary = new ArrayList<Integer>();
	while(num <= b) {
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
	System.out.println(end);
	}
	
	public void printShortBinary(short s) {
		int ag = s;
		//System.out.println(ag);
		int num = 1;
		ArrayList<Integer> a = new ArrayList<Integer>(); 
		ArrayList<Integer> rev = new ArrayList<Integer>();
		ArrayList<Integer> binary = new ArrayList<Integer>();
		while(num <= s) {
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
		System.out.println(end);
	}
	
	public void printIntBinary(int n) {
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
		System.out.println(end);
	}
	
	public void printLongBinary(long l) {
		int ag = (int)l;
		//System.out.println(ag);
		int num = 1;
		ArrayList<Integer> a = new ArrayList<Integer>(); 
		ArrayList<Integer> rev = new ArrayList<Integer>();
		ArrayList<Integer> binary = new ArrayList<Integer>();
		while(num <= l) {
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
		System.out.println(end);
	}
}
