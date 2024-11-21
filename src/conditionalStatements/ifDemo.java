package conditionalStatements;

public class ifDemo {
	
	public static void main(String[] args) {
		//if statement
		
/*		if(condition[boolean]) {
			
		}
*/
		
//		int bagWeight=5;
//		if(bagWeight>=5) {
//			System.out.println("A will pick the bag");
//		}
		
		/*		
		 if(condition[boolean]) {
		//your code
		}else{
		//your code
		}
*/		
		
//		int money=60;
//		if(money>50) {
//			System.out.println("I will buy pizza");
//		}else {
//			System.out.println("I will buy gupta ji ka burger");
//		}		
		
		
		/*		
		 if(condition[boolean]) {
		//your code
		}else if(boolean){
		//your code
		}else{
		//your code
		}
*/		
		
//		int rank = (int)(Math.random()*10);//double 0.00 ->
//		System.out.println(rank);
//		if(rank == 1) {
//			System.out.println("Gold medal");
//		}else if(rank == 2) {
//			System.out.println("Silver medal");
//		}else if(rank == 3) {
//			System.out.println("Broze medal");
//		}else {
//			System.out.println("Better luck next time");
//		}
		
		//nested if
		/*
			if(condition){
				if(condition){
					if(condition){
					}
				}
			}

		 * */
		
//		int box1 = 1;
//		int box2 = 1;
//		if(box1 == 1) {
//			if(box2==1) {
//				System.out.println("gift found");
//			}
//		}
		
		
		int age = 18;
		String nationality = "indian";
		boolean alive = true;
		
		if(age>=18) {
			if(nationality.equalsIgnoreCase("Indian")) {
				if(alive) {
					System.out.println("Contratulations you are eligible to caste vote");
				}else {
					System.out.println("Caste vote in heaven");
				}
			}else {
				System.out.println("You need to caste vote in your country");
			}
		}else {
			System.out.println("You are under age to caste vote");			
		}
	}
	
	

}
