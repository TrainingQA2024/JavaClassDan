package StringBufferBuilder;

public class GetPallindrome {
	
	public boolean pallindrome(String name) {
		StringBuffer sb= new StringBuffer(name);
		sb.reverse();
		if(sb.toString().equals(name)) {
			return true;
		}else {
			return false;
		}		
	}
	
	public static void main(String[] args) {
		String name="madam";
		GetPallindrome p=new GetPallindrome();
//		System.out.println(p.pallindrome(name));
		if(p.pallindrome(name)) {
			System.out.println(name+ " is palindrome");
		}else {
			System.out.println(name+ " is not palindrome");
		}		
	}

}
