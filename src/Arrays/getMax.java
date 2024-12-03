package Arrays;

public class getMax {
	public static void main(String[] args) {
		int [] num= {145,203,65,123};
		int max=Integer.MIN_VALUE;
//		System.out.println(max);
		
		for(int i=0;i<num.length;i++) {
			if(num[i]>max) {
				max=num[i];
			}
		}
		System.out.println(max);
	}

}
