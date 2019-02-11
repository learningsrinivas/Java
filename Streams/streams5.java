package com.epam.streams;

import java.util.Arrays;
import java.util.List;

public class streams5 {

	public static void main(String[] args) {
		List<Integer>  numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
		
		System.out.println(numbers.stream()
				.filter(e -> e > 3)
				.filter(e -> e % 2 == 0)
				.map(e -> e * 2)
				.findFirst());
			
	System.out.println(	numbers.stream()
				.filter(streams5::isGreaterThanThree)
				.filter(streams5::isEven)
				.map(streams5::doubleIt)
				.findFirst());
			
	}
	
	public  static boolean isGreaterThanThree(int number) {
		return number > 3;
	}
	
	public static  boolean isEven(int number) {
		return number % 2 == 0;
	}
	
	public  static int doubleIt(int number) {
		return number * 2;
	}
}
