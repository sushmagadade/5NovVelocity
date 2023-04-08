package Polymorphism;

public class overloading {
	
	public void addition(int a,int b) {
		
		System.out.println(a+b);
	}
	
    public void addition(int a,int b,int c) {
    	
    	System.out.println(a+b+c);
    }
    
    public static void main(String[] args) {
		
    	overloading x =new overloading();
    	 
    	x.addition(50,40);
    	x.addition(10, 20, 30);
	}
}
