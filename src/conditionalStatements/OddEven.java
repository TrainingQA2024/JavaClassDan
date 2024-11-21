package conditionalStatements;

public class OddEven {
	
//	public void getOddEven(int num) {
//		if(num%2 ==0) {
//			System.out.println(num+" is an even number");
//		}else {
//			System.out.println(num+" is an odd number");
//		}
//	}
	
	public String getOddEven(int num) {
		if(num%2 ==0) {
			return "even";				
		}else {
			return "odd";
		}
	}
	public static void main(String[] args) {
		int num= 72;
		OddEven ob= new OddEven();
		String status= ob.getOddEven(num);
		System.out.println(status);
	}

}
