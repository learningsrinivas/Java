package com.epam.streams;

import java.util.stream.Stream;

public class streams7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int startingNumber = 100;
		int countOfNumbers = 10;
		System.out.println(" the sum of numbers");
			System.out.println(Stream.iterate(startingNumber,e -> e + 1)
					.filter( e -> e % 2 == 0)
					.filter(e -> Math.sqrt(e) > 0)
					.mapToInt(e -> e * 2)
					.limit(countOfNumbers)
					.sum());
			
			System.out.println("the number are");
			Stream.iterate(startingNumber,e -> e + 1)
			.filter( e -> e % 2 == 0)
			.filter(e -> Math.sqrt(e) > 0)
			.mapToInt(e -> e * 2)
			.limit(countOfNumbers)
			.forEach(System.out::println);
			
			System.out.println("array stream");
			Stream.of(2,3).forEach(System.out::println);
					
	}

}
