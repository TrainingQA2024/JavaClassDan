package exceptionHandling;
//user defined exception
public class TooYoungException extends Exception{
	public String toString() {
		return "Mujhe se mat pucho";
	}
	
	public static void main(String[] args) throws TooYoungException {
		
//		if(age<18)
//			throw new TooYoungException();
		
		//ternary operator
		// condition?a:b
//		if(age>18) {
//			System.out.println("Cast vode");
//		}else {
//			System.out.println("under age");
//		}
		int age =14;
		String a="caste vote";
		String b= "cant vote";
		String output="";
		output=(age>18) ? a:b;
		System.out.println(output);
		
	}
}
