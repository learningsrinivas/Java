package com.epam.thisreference;

public class ThisReferenceExampleinnerclass {
	
	public void doProcess(int i,Process p) {
		p.process(i);
	}

	
	public static void main(String[] args) {
		ThisReferenceExampleinnerclass thisReferenceExample = new ThisReferenceExampleinnerclass();
		thisReferenceExample.doProcess(10, new Process() {

			@Override
			public void process(int i) {
				// TODO Auto-generated method stub
				System.out.println("Value of is "+i);
				System.out.println(this);
			}
			
			public String toString() {
				return "This is anonmous inner class";
			}
		
		
	});
		
}
	
	
}

interface Process{
	void process(int i);
}