package com.mru.oops;

class Parent12{
	public void dbConn() {
		System.out.println("data from oracle soon.....!");
	}
}

class Child12 extends Parent12{
	public void dbConn() {
		System.out.println("data from mango db soon....!");
	}
	
}

public class Oop5 {
	public static void main(String[] args) {
		Child12 obj = new Child12();
		obj.dbConn();
	}

}
