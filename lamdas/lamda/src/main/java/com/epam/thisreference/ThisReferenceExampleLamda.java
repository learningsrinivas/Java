package com.epam.thisreference;

public class ThisReferenceExampleLamda {

	public void doProcess(int i,Process p) {
		p.process(i);
	}
	
	public void execute() {
		doProcess(10,i-> {
			System.out.println("Value of i :"+i);
			System.out.println(this);
		});
	}
	
	public static void main(String[] args) {
		ThisReferenceExampleLamda thisReferenceExampleLamda = new ThisReferenceExampleLamda();
		thisReferenceExampleLamda.execute();
	}
	
	public String toString() {
		return "this is the main ThisReferenceExampleLamda class instance";
	}
}
