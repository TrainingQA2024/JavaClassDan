package Arrays;

public class ReverseString {

	public static void main(String[] args) {
		String s="Danish";//sequence of characters
		char[] ch= s.toCharArray();
//		for(int i=0;i<ch.length;i++) {
//			System.out.println(ch[i]);
//		}
		String output="";
		for(int i=ch.length-1;i>=0;i--) {
//			System.out.println(ch[i]);
			output = output+ch[i];
		}
		System.out.println(output);
	}
}
