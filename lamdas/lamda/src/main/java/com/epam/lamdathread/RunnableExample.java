package com.epam.lamdathread;

public class RunnableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("INside anonymous inner class");
			}
			
		});
	t.start();

	Thread myLamdaThread =  new Thread(()->System.out.print("My Lamda Thread"));
	myLamdaThread.start();
	}

}
