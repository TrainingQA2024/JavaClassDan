package AccessModifiers2;

import AccessModifiers.ProtectedDemo;

public class TestChild extends ProtectedDemo{
	
	public static void main(String[] args) {
		TestChild ob = new TestChild();
		String mystate= ob.state;
		System.out.println(mystate);
		ob.method2();
	}
}
