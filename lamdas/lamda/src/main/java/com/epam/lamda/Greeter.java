package com.epam.lamda;

public class Greeter {

	public void greet(Greeting greeting) {
		greeting.printGreetMessage();
	}
	
	
	public static void main(String[] args) {
		
		HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
		Greeter greeter = new Greeter();
		greeter.greet(helloWorldGreeting);
		
		
		GoodMornigGreeting goodMornigGreeting = new GoodMornigGreeting();
		greeter.greet(goodMornigGreeting);
		
		Greeting myLamdaGreeting = () -> System.out.println("Lamda Greeting");
		
		myLamdaGreeting.printGreetMessage(); // This is how lamda expressions executed by calling interface method on lamda expression.
		
		Greeting innerClassGreeting = new Greeting() {
			public void printGreetMessage() {
				System.out.println("Inner Class Greeting");
			}
		};
		
		innerClassGreeting.printGreetMessage();
		
		greeter.greet(innerClassGreeting);
		greeter.greet(myLamdaGreeting);
		
		greeter.greet(() -> System.out.println("Type Inference Example Greeting"));
		
	}
}
