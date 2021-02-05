package kr.co.multi;

public class Calculator {
	public int add(int i, int j) {
		return i+j;
	}
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println(cal.add(1, 6));
	}
}
