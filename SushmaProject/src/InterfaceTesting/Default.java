package InterfaceTesting;

public interface Default {
	
	//Default method of interfae
	//Default is keyword not access specifier
	//mart mthod is by default public
	
	public default void mart () {
		
		System.out.println("shops");
		
	}
	
	public static void xyz () { // complete static method
	     System.out.println("Static method of interface is running");
	}
	
	     public void show(); //incomplete method of interface

}
