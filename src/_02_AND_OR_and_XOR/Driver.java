package _02_AND_OR_and_XOR;

public class Driver {
	public static void main(String[] args) {
		byte a = 0b1110;
		byte b = 0b1011;
		byte c = (byte)0b11101011;
		System.out.println(c);
		System.out.println(Integer.toBinaryString(1|16));
		
		System.out.println(Integer.toBinaryString(c));
	}
}
