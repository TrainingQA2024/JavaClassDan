package conditionalStatements;

public class marksheet {
	
	public static void main(String[] args) {
		//marks >=90 A, 80 and 90 - B, 60 and 80 - C, BELOW 60 Fail
		int marks=92;
		if(marks>=90) {
			System.out.println("Grade A");
		}else if(marks>=80) {
			System.out.println("Grade B");
		}else if(marks>=60) {
			System.out.println("Grade C");
		}else {
			System.out.println("Grade Fail");
		}		
	}

}
