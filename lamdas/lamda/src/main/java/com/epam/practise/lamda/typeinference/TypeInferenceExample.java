package com.epam.practise.lamda.typeinference;

public class TypeInferenceExample {
	
	
	public static void main(String[] args) {
		
		StringLengthLamda myLamda = (String s)-> s.length();
		
		System.out.println(myLamda.getLength("Hello World"));
		
		
		
		myLamda = (s)-> s.length();
		
		System.out.println(myLamda.getLength("Srinivas"));
		
		
		myLamda = s -> s.length();
		
		System.out.println(myLamda.getLength("Hello Lamda"));
	}
	
	
	
	
	
	interface StringLengthLamda {
		int getLength(String s);
	}

}
