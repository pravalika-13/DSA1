package com.mru.oops;

import java.util.ArrayList;

public class JavaFeatures {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		//print even numbers
		list1.stream().filter(num->num==0).forEach(System.out::println); //read line by line
		
		//print odd numbers
		list1.stream().filter(num->num/2!=0).forEach(System.out::println);
		
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(10);
		list2.add(20);
		list2.add(30);
		list2.add(40);
		list2.add(50);
		
		list2.stream().map(num -> num*10).forEach(System.out::println);
		
		ArrayList<String> list3 = new ArrayList<>();
		list3.add("Hello");
		list3.add("welcome");
		list3.add("cse");	
		
		list3.stream().map((name)->{
				return new StringBuilder(name).reverse().toString();
		}).forEach(System.out::println);

	}

}
