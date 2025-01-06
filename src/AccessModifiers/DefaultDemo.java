package AccessModifiers;

public class DefaultDemo {
	
	public DefaultDemo(){
		System.out.println("I am Default Demo constructor");
	}
	
	String name="Danish";
	void task() {
		System.out.println("Test login functionality");
	}
	
	public static void main(String[] args) {
//		DefaultDemo ob = new DefaultDemo();
//		System.out.println(ob.name);
//		ob.task();
		ProtectedDemo pdemo= new ProtectedDemo();
		System.out.println(pdemo.state);
		pdemo.method2();
		
	}

}
