package AbstractEncapsulGeneralis;

public class Jio implements Simcard {
	
	public void Audiocalling() {
		 System.out.println("unlimited audio calling");
		
	}

	@Override
	public void TextMessage() {
		System.out.println("Dily 100 sms");
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Internet() {
		System.out.println("Daily 2 GB Data");
	// TODO Auto-generated method stub
		
	}
	public void NewFeature() {
		System.out.println("2 off subscription");
	}

}
