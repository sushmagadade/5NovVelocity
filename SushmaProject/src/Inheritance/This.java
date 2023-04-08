package Inheritance;

public class This {//This keyword is used to access global variable from same class
	
	int a=75; //global variable
	
	public void Test() {
		
		int a=58; //local variable
		System.out.println(a);  //local variable 58
		
		System.out.println(this.a);  //75 global variable
		
	}
	
	public void Basic() {
		int a=23;//local
		
		System.out.println(a); //local 23
		System.out.println(this.a); //global 75
		
	}
	public static void main(String[] args) {
		
		This x = new This();
		x.Test();
		x.Basic();
		
	}

}
