package Methods;

public class CallABC extends ABC { //concrete class
	
	public void Rest() {
		System.out.println("Implemented method");
		
	}
	
	public void Test() {
		System.out.println("Test method reimplemented");
	}
	
	public static void main(String[] args) {
		CallABC x =  new CallABC ();
		
		x.Rest();
		x.Test();
		
		ABC y = new  CallABC ();
		y.test();
		y.rest();
		
		
	}

	@Override
	public void rest() {
		// TODO Auto-generated method stub
		
	}
}
