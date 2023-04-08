package Inheritance;

public class Super1 extends Super123 { // int a=12;
	
	int a =15; // global variable
	
	public void Test() {
		
		int a =67; //local variable
		
		System.out.println(a); //local vaiable from same class
		
		System.out.println(this.a); //global variable from name class
		
		System.out.println(super.a); //global variable from super class
	}
	
	public static void main(String[] args) {
		
		Super1 z = new Super1();
		z.Test();
		
	}
	

}
