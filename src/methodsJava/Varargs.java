package methodsJava;

public class Varargs {
	
/*	void show(){
		System.out.println("blank");
	}
	
	void show(int a){
		System.out.println(a);
	}
	
	void show(int a, int b){
		System.out.println("a: "+a+" b: "+b);
	}
	*/
	
	void show(long... num) {//variable argument = 3 dots mandatory
		long sum=0;
		for(long x:num) {

			sum=sum+x;
		}
		System.out.println("Sum is "+sum);
	}

	void show1(long[] num) {//variable argument = 3 dots mandatory
		long sum=0;
		for(long x:num) {

			sum=sum+x;
		}
		System.out.println("Sum is "+sum);
	}
	
	void watch(char c,String str,int... num) {
		System.out.println(c+": "+str);
		for(int x:num) {
			System.out.println(x);
		}
	}
	
	String concatenate(String... str) {
		String output="";
		for(String s:str) {
			output = output+" "+s+" ";
		}
		return output.trim();
	}
	
	public static void main(String[] args) {
		Varargs ob = new Varargs();
//		ob.show();
//		ob.show(3);
//		ob.show(3,6);
//		ob.show(3,6,6,7,8,8,8,2,4,5,6,6,7,7,6);
//		ob.watch('c', "Example", 3,5,6);
		long arr[]= {2,3,5,6};//limited size
//		ob.show1(arr);
		ob.show(2,3,5,6,4,5,6);//unlimited data	
		String str=ob.concatenate("Java","is","fun");
		System.out.println(str);
	}
	
	//maximum = {2,3,5,1};
		
	
	

}
