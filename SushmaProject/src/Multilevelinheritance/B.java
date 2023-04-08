package Multilevelinheritance;

public class B extends A {
	int a,b,c;
	void mul()
	{
		a=20;b=40;
		c=a*b;
		System.out.println("multiplication of two numbers"+" "+c);
	}
	
     void div()
     {
         a=40/20;
         c=a/b;
         System.out.println("division of two numbers"+" "+c);
     
     }

     
}    