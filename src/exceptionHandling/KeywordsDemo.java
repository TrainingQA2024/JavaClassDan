package exceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class KeywordsDemo {
	
	/*
	 Keywords
	 1. try - handles risky code
	 2. catch - Handles the exception
	 3. finally - Clean up operation
	 4. throw - Custom exception
	 5. throws - throw exception to next method
	  
	 * */
	
	public static void main(String[] args) {
		
		
			writefile();
		
//		try {
//			//risky code
//			int result = 10/0;
//			System.out.println("completed");
//		}catch(ArithmeticException e) {
//			System.out.println("Division by zero not allowed");
//		}
/*		
		int[] num= {1,2,3,4};
		try {
			System.out.println(num[2]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("index not available");
		}finally {
			System.out.println("closing resource file");						
		}
*/	
		int age = 15;
		if(age<18) {
			throw new IllegalArgumentException("Age must be 18 or above");
		}
	}
	
	public static void readFile() throws FileNotFoundException {
		FileReader freader = new FileReader("test.txt");
		
	}
	
	public static void writefile() {
		String file="abc";
		try {
			readFile();
		}catch (FileNotFoundException e) {
			System.out.println("create new file");//
		}catch(ArrayIndexOutOfBoundsException e) {
			//code
		}catch(NullPointerException e) {
			//code
		}catch(Exception e) {
			//all exception
		}
	}

}
