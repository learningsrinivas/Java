package com.epam.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		List<String> items = new ArrayList<String>();

		items.add("one");
		items.add("two");
		items.add("three");
		items.add("one");
		items.add("laraggejfghj");

		System.out.println("first line of code");
		items.forEach((String s) -> System.out.println(s));

		System.out.println("end of first line of code");
		Stream<String> stream = items.stream();

		// stream
		// .map( item -> item.toUpperCase()).forEach(p->System.out.println(p));;

		stream.forEach(p -> {

			System.out.println(p.toUpperCase());

		});

		items.stream().sorted().forEach(p -> System.out.println(p));
		

		IntStream.range(1, 10).skip(8).forEach(p -> System.out.println(p + " "));

		System.out.println(IntStream.range(1, 10).sum());
		
		System.out.println(IntStream.range(1, 100).sum());

		Stream.of("srinivas", "shiva", "john").sorted().forEach(p -> System.out.println(p));

		String[] names = { "srinivas", "shiva", "john" };

		Arrays.stream(names).sorted().forEach(p -> System.out.println(p));

		System.out.println("shortcut");
		Arrays.stream(names).sorted().forEach(System.out::print);

		Arrays.stream(new int[] { 2, 4, 6, 8, 10 }).map(x -> x * x).average().ifPresent(System.out::println);

		System.out.println("minimum length");
		
		String shortest = items.stream().min(Comparator.comparing(item -> item.length())).get();
		
		String longest = items.stream().max(Comparator.comparing(item -> item.length())).get();
		
		System.out.print("longest ");
		System.out.println(longest);

		System.out.print("shortest");
		System.out.println(shortest);

		long count = items.stream().filter(item -> item.startsWith("t")).count();
		System.out.println("number of items starting with t ");
		System.out.println(count);
	}

}
