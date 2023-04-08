package Abstraction;

public class xyz extends Basic {
	
	public void show() {
		System.out.println("implemented show method");
	}
	public static void main(String []arg) {
		Sample p = new Sample();
		   p.show();
		   
		   xyz e = new xyz();
			e.show();	   
	}

}

