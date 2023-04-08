package Practice;

public class PrimeNumber {
	public static void main(String [] args) {
		
        int no = 7;
        for(int i=2;i<=no-1;i--) {
        	if(no%i!=0) {
        		System.out.println("no is not prime number");
        		
        	}
        	else {
        		System.out.println("no is prime number");
        	}
        }
        

	}
}
