package AbstractEncapsulGeneralis;

public class TestGeneralization {

	public static void main(String[] args) {
		
		System.out.println("************** Specification of Jio***************");
		Jio x =new Jio();
		x.Audiocalling();
		x.TextMessage();
		x.Internet();
		x.NewFeature();
		
		
		System.out.println("**************Specification of VI************");
		VI y = new VI();
		y.Audiocalling();
		y.TextMessage();
		y.Internet();
		
		
		System.out.println("*************Specification of BSNL***********");
		BSNL s = new BSNL();
		s.Audiocalling();
		s.TextMessage();
		s.Internet();
		
	}
	
}
