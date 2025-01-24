package com.mru.oops;

public class Oop4 {
	

	public void addition(int num1, int num2) {
		int res1 = num1 + num2;
		System.out.println(res1);
	}
		
	public void addition(int num1, int num2, int num3) {
		int res2 = num1 + num2 + num3;
		System.out.println(res2);
	}
		
	

	public static void main(String[] args) {
		Oop4 obj = new Oop4();
		obj.addition(10, 50);
		obj.addition(10, 5, 3);

	}

}
