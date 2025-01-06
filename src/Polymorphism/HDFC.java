package Polymorphism;

public class HDFC extends RBI{
	
	public void personalLoan() {
		System.out.println("I am HDFC PL - 10%");
	}
	@Override
	public void homeloan() {
		
		System.out.println("I am HDFC HL - 6%");
	}
	
	public static void main(String[] args) {
		HDFC hdfc= new HDFC();
		hdfc.personalLoan();
		hdfc.homeloan();
	}
	
}
