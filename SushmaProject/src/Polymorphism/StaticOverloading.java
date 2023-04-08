package Polymorphism;

public class StaticOverloading {
	
	public static void addition(int a,int b) {
		
		System.out.println(a+b);
	}
	
	public static void addition(int a,int b,int c) {
		
		System.out.println(a+b+c);
	}
     public static void main(String[] args) {
		
    	 StaticOverloading.addition(20, 30);
    	 StaticOverloading.addition(20, 40, 50);
	}
}
