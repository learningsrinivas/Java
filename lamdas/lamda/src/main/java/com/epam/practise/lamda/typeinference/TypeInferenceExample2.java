package com.epam.practise.lamda.typeinference;

public class TypeInferenceExample2 {

	
	public static void main(String[] args) {
		
		printStringLength((String s) -> s.length());
		
		printStringLength((s)->s.length());
		
		printStringLength(s -> s.length());
	}
	
	public static void printStringLength(StringLengthLamda myLamda) {
		System.out.println(myLamda.getLength("Srinvas"));
	}
	
	interface StringLengthLamda{
		int getLength(String s);
	}
}
