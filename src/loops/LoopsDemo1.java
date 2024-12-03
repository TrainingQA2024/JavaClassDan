package loops;

import java.util.Scanner;

public class LoopsDemo1 {

	public static void main(String[] args) {

//		System.out.println("Book1");
//		System.out.println("Book2");
//		System.out.println("Book3");. 

		/*
		 * 
		 * Type of Loops 1. For loop - iteration is fixed 2. While - iteration is not
		 * fixed. 3. Do while - at least one time loop should be run 4. For each loop -
		 * Advanced for loop: it picks every element lying in the array or collection.
		 * 
		 */

		/*
		 * for([initialization], condition, [updation]){ //code }
		 * 
		 */

//		for(int i=0;i<10;i++) {
//			System.out.println("Book"+i);
//		}

		/*
		 * while(condition){ //condition is true //condition }
		 */

//		int balance=100;
//		while(balance>=0) {
//			System.out.println("Service is activated");
//			balance =balance -20;
//		}		
//		String password = "Java123";//password in db
//		Scanner sc = new Scanner(System.in);
//		String userPwd;
//		int count=0;
//		do {
//			System.out.println("Please enter your password");
//			userPwd	= sc.next();//abc
//			count++;
//		}while(!userPwd.equals(password) && count<=3);//abc==Java123 = false
//		
//		if(count>=3) {
//			System.out.println("blocked");
//		}else {
//			System.out.println("Access is granted");
//		}

//		int balance=100;
//		for(;balance>=0;) {
//			System.out.println("Service is activated "+balance);
//			balance =balance -20;
//		}		

		int i = 0;
		while (i < 10) {
			System.out.println("Book" + i);
			i++;
		}
	}
}
