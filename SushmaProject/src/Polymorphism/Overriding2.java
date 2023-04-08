package Polymorphism;

public class Overriding2 extends Overriding1 {
	
	public void Statement() {
		
		System.out.println("method from subclass is running");
		
	}
	public static void main(String[] args) {
		
		Overriding2 z = new Overriding2();
		z.Statement();
		 
		Overriding1 y = new Overriding2();
		y.Statement();
	}

}
