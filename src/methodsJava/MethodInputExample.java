package methodsJava;

public class MethodInputExample {

	void greet() {
		System.out.println("Hello users!");
	}
	
	void greet(String name) {
		System.out.println("Hello "+name+"!");
	}
	//void method - non parameterized
	void signout() {
		System.out.println("Bye users!");
	}
//	void method - parameterized
	void signout(String name) {
		System.out.println("Bye "+name+" !");
	}
	public int getSquare(int num) {
		int result=0;//5x5=25
		result = num*num;
		return result;
	}	
	public static void main(String[] args) {
		MethodInputExample ob = new MethodInputExample();
/*		String name = "Danish";
		ob.greet(name);
//		ob.signout();
		ob.signout(name);
	
		
	*/	
		for(int i=1;i<=5;i++) {
			int out= ob.getSquare(i);
			System.out.println("square of "+i+" is "+out);
		}
	}
}
