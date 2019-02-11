package com.epam.streams;

import java.util.Arrays;
import java.util.List;

public class stream6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,1,2,3,4,5);
		
		numbers.stream()
				.filter(e -> e % 2 == 0)
				.sorted()
				.forEach(System.out::println);
		
		System.out.println("distinct elements");
		numbers.stream()
		.filter(e -> e % 2 == 0)
		.distinct()
		.forEach(System.out::println);
		
		System.out.println("Normal elements");
		numbers.stream().filter(e -> e % 2 == 0).forEach(System.out::println);
	}

	
}
