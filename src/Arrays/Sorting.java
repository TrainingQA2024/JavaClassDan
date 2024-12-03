package Arrays;

public class Sorting {//bubble sort
	
	public static void main(String[] args) {
		int [] arr = {45,23,54,20,50};//hard coding
		for(int i=0;i<arr.length;i++) {			
			for(int j=i+1;j<arr.length;j++) {//45<23
				if(arr[i]>arr[j]) {//ascending order <, descending order >
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int x:arr) {
			System.out.println(x);
		}		
		System.out.println("Max: "+arr[arr.length-1]);
		System.out.println("Second Max: "+arr[arr.length-2]);
		System.out.println("Min: "+arr[0]);
		System.out.println("Second min: "+arr[1]);
	}
}
