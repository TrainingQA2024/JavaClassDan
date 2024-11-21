package stringDemo;

public class StringDemo1 {

	// String = "abcdsfdsf"//String is a sequence of characters
	//String is immutable.
	public static void main(String[] args) {
		
	/*	int a=45;
//		a++;
		System.out.println(a++);
		System.out.println(a);
		
		String text="First";
		text= text+" second";//First second
		System.out.println(text);
		
		String s1="Java";//Constant Pool
		String s2="Java";
		String str1= new String("Java");//Heap 
		String str2= new String("Java");//Heap 
//		System.out.println(s1==s2);//
//		System.out.println(str1==str2);
//		System.out.println(s1 == str1);
		
		System.out.println(s1.equals(str1));

		
		String expectedExcel = "JAVA";
		String actual = "Java";
		
//		System.out.println(expectedExcel.equalsIgnoreCase(actual));
//		System.out.println(expectedExcel.toLowerCase().equals(actual.toLowerCase()));
*/
		
		String fname="Danish";
		String lname="Kalim";
		System.out.println(fname.length());
		System.out.println(fname+" "+lname);
		System.out.println(fname.concat(" ").concat(lname));
		String name = fname.concat(" ").concat(lname);
		System.out.println(name);
		System.out.println(name.substring(0, 6));
		System.out.println(name.replace('K', 'S'));
		String xpath="//div[@class='xxx']";
		System.out.println(xpath.replace("xxx", "india"));
		System.out.println(name.startsWith("Danish"));
		String line="Java is fun";
		String[] words= line.split(" ");
//		for(String x:words) {
//			System.out.println(x);
//		}
		
		System.out.println(words[2]);
		
		String url = "https://google.com?name=tajmahal";
		String[] URLArray=url.split("\\?");
//		System.out.println(url.split("\\?")[1]);
		for(String x:URLArray) {
			System.out.println(x);
		}
		System.out.println(URLArray[1]);	//==-> object reference, equal()->content			
	}
}
