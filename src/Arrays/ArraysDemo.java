package Arrays;

import java.util.Scanner;

import AccessModifiers.DefaultDemo;

public class ArraysDemo {
	
	public static void main(String[] args) {
/*		
		int[] arr= new int[4];
//		int[] arr = {2,1,4,5,6};
		arr[0] =6;
		arr[1]=7;
		arr[2]=8;
		arr[3]=9;
		//for each loop
		
//		for(Array_dataType variableName:ArrName){}
		for(int x:arr) {//6,7,8
			System.out.println(x);
		}
		System.out.println("Array length: "+arr.length);
	
*/
//		String[] fruits= {"Apple","Banana","Orange","Mango"};
//		int count=1;
//		for(String fruit:fruits) {
//			System.out.println(count+". "+fruit);
//			count++;
//		}
//		for(int i=0;i<fruits.length;i++) {
//			System.out.println(fruits[i]);
//		}
		
/*		int num[]= new int[4];
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the numbers");
		for(int i=0;i<num.length;i++) {
			num[i] = sc.nextInt();
		}
		System.out.println("Array");
		for(int x:num) {
			System.out.println(x);
		}
	*/	
		
		int[] number= {2,7,12,6};
		int product=1;//2,9,21,27
		for(int x:number) {//2,7,12,6
			product = product*x;//0+2=2,2+7=9,9+12=21,21+6=27
		}
		System.out.println(product);
		
//		DefaultDemo Demo= new DefaultDemo();
		
	}	
}
