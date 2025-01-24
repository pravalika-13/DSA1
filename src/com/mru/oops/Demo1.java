package com.mru.oops;

interface Interface1{
	public void addition();
	
	public void subtraction(int num1, int num2);
	
	public int multiplication();
	
	public int division(int num1, int num2);	
}
class Test1 implements Interface1{

	@Override
	public void addition() {
	int num1 = 50;
	int num2 = 100;
		System.out.println(num1+num2);
	}

	@Override
	public void subtraction(int num1, int num2) {
		int res = num1 - num2;
		System.out.println(res);
		
	}

	@Override
	public int multiplication() {
		int num1 = 30;
		int num2 = 20;
		int res = num1 * num2;
		return res;
	}

	@Override
	public int division(int num1, int num2) {
		int res11 = num1 / num2;
		return res11;
	}	
}

public class Demo1 {

	public static void main(String[] args) {
		Test1 test1 = new Test1();
		test1.addition();
		test1.subtraction(200,100);
		
		int res1 = test1.multiplication();
		System.out.println(res1);
		
		int res11 = test1.division(200 ,100);
		System.out.println(res11);

	}

}
