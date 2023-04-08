package Inheritance;

public class child extends parent {
	
	public void bike()
	{
		System.out.println("bike");
	}
	
	public static void main(String[] args) {
		child x= new child();
		x.home();
		x.money();
		x.car();
		x.bike();
	}

}
