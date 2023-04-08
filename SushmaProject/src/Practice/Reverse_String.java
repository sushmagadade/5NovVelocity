package Practice;

public class Reverse_String {
	public static void main(String [] args ) {
		String str = "ABCD";
		String Rev = " ";	
		
		int len = str.length();
		
		for(int i=len-1;i>=0;i--) {
			Rev = Rev + str.charAt(i);
			
		}
		
		System.out.println("reverse the string :"+Rev);
	
	}

}
