package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

/*calculator-div
 input 1= 0
 input 2 = 0
 input1/input2=50/2=25 - infinity, not define - Arithmetic Exception

  word file - read - report - running-store -- FileNotFoundException
  8gb ram - 50 program -1 program - error outofmemory-

  Exception - Exception is an unwanted and unexpected event that breaks the flow of the program.

  Types of Exceptions
  1. Checked Exception - compile time
  2. Unchecked Exception - run time


 * */
public class ExceptionHandling {

	public static void main(String[] args) {
		//checked Exception
		//		try {
		//			Thread.sleep(343);
		//		} catch (InterruptedException e) {
		//			// TODO Auto-generated catch block
		//			e.printStackTrace();
		//		}

		//unchecked exception
		try {
			Scanner sc= new Scanner(System.in);
			System.out.println("Please enter number 1");
			int num1=sc.nextInt();
			System.out.println("Please enter number 2");
			int num2=sc.nextInt();
			System.out.println(num1/num2);
		}catch (ArithmeticException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("String is not allowed");
		}finally {
			System.out.println("Program ends here");
		}		
	}
}
