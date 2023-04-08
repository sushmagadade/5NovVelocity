package String;

public class MethodString {
	 
	public static void main(String [] args) {
		
		String s1 = "velocity  pune  katraj";
		String s2 =  "     Velo   city    ";
		String s3 = "city";
//		
//		System.out.println (s1.charAt(4)); //to print character any index
//		System.out.println (s1.replace("V", " y")); //to replace old character to new
//		System.out.println(s2.isEmpty()); //true or false
//		System.out.println(s2.concat(s3)); //to combine two String
//		System.out.println(s2.substring(2));//
//		System.out.println(s1.substring(1, 6)); //1 to up to 6 char
//		System.out.println(s1.startsWith("Ve")); //starts with letter
//		System.out.println(s1.endsWith("ty"));
//		System.out.println(s1.indexOf("c")); 
//		System.out.println(s1.lastIndexOf("c"));
//		System.out.println(s1.length());
//		System.out.println(s1.contains("s3"));
//		System.out.println(s2==s3);
//		System.out.println(s2.equals(s3));
		System.out.println(s1.trim());
		System.out.println(s2.replace(" ", ""));
		//System.out.println(s1.replaceAll("[0-9  @]", "");
		System.out.println(s1.replaceAll("[A-Z a-z @ # $ %]",""));
		//System.out.println(s1.replace("@", "  "));
		System.out.println(s1.length());
		String s4=s1.replace(" ", "");
		System.out.println(s4.length());
		System.out.println(s1.toUpperCase());
	}   

}
