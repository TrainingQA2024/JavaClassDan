package finalKeyword;

public class FinalKeywordDemo {
	
	
	/*
	 Final keyword is a modifier in java. It applies on
	 1. variable
	 2. method
	 3. class
	 
	 It makes these constant. It cannot be changed.
	 
	 Final Variable - A final variable can not be changed once initialized.
	 
	 final double pi - 22/7=3.14
	 
	 
	 * */
	
 final int rollNumber;//int default = 0;
	
	FinalKeywordDemo(int rollNumber){
		this.rollNumber = rollNumber;
	}
	public static void main(String[] args) {
		FinalKeywordDemo ob1= new FinalKeywordDemo(101);
//		ob.rollNumber=103;//compile time error
		System.out.println(ob1.rollNumber);
		
		FinalKeywordDemo ob2= new FinalKeywordDemo(102);
//		ob2.rollNumber=103;//compile time error
		System.out.println(ob2.rollNumber);
	}

	//Method - Final
}
