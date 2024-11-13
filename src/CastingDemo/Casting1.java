package CastingDemo;

public class Casting1 {

	
	/*	
	Casting - conversion of one data type in to another data type
	
	Type of cating
	1. Primitive Casting - int-> double, double->int
	2. Reference Casting(Object casting)-> using subclass reference in superclass or vice versa.
	
	
	Primitive Casting
	1. Implicit Casting(widening) - > automatically handled by java
	2. Explicit Casting (narrowing)- > externally done by user.
	
	Reference Casting
	1. upcasting
	2. downcasting
	 * */
	

	
	public static void main(String[] args) {
		//implicit casting
/*		byte a=10;
		byte b=5;
		int c=a+b; //byte->int 
		short d=2;
		int e=a+d;
		long l=45l;
		long i= e+l;
		float f=5.6f;
		float g=i+f;		
		System.out.println(e);
	*/	
		//explicit
		
	/*	float f=4.5f;
		long i=5;
		long j=(long)f+i;
		
		System.out.println(j);*/
		
		char a='a';
		double b=a+0.98;
		System.out.println(b);
		System.out.println(-10/0.0);//int 0 undefined->arithmetic exception, 0.0 - infinity
	}
}
