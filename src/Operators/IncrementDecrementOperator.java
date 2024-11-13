package Operators;

public class IncrementDecrementOperator {
	
	public static void main(String[] args) {
		
		/*
	increment ++ = +1
	decrement -- = -1

	pre-increment ++variable, --variable
	post-increment variable++, variable--
	
		 */
		
//		int x=3;
//		System.out.println(x);//3
//		System.out.println(++x);//1+3=4
//		System.out.println(x++);//
//		System.out.println(x);
//		System.out.println(--x);
//		System.out.println(x--);
//		System.out.println(x);
		

		int a=5,b=3,output;//4
		output = ++a + b++ - --b + a--;
		//6+3-3+5
//		System.out.println(++a);
		int c=a+b++;
//		System.out.println(c);
		int d=c - --b;
//		System.out.println(d);
		int e=d +a++;

		System.out.println(e);
		
		System.out.println(output);
	}
}
