package String;

public class ReverseString {

	public static void main(String[] args) {

		String a = "Sushma Amar Lavte";// index=012345,length=123456,a.length=6-1=5;
		String reverse = " ";

		for (int i = a.length() - 1; i >= 0; i--) // i=5,rev=" "a.length is for counting the length
		{
			reverse = reverse + a.charAt(i);

		}
		System.out.println(reverse);

	}

}
