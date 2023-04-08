package String;

public class stringpractice {
	public static void main(String[] args) {
	
	String s1="pune";
	String s2="Pimparichinchwad";
	String s3="PUNE";
	
   System.out.println(s1.charAt(3));
   System.out.println(s1.equals(s3));
   System.out.println(s1.equalsIgnoreCase(s3));
   System.out.println(s2.toUpperCase());
   System.out.println(s3.toLowerCase());
   System.out.println(s3.concat(s2));
   System.out.println(s1.length());
   System.out.println(s2.indexOf("c"));
   System.out.println(s2.substring(3));
   System.out.println(s1.trim());
   System.out.println(s2==s1);	
	

}
}