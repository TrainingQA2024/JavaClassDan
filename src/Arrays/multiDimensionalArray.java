package Arrays;

public class multiDimensionalArray {
	
	public static void main(String[] args) {//[23,12,23,34,35] - collections
		/*
			{2,3,4,5,6,7,8}=single array
			{{2,4,6},{8,10,12},{14,16,18}} = 2d array
			table format - excel
			
			declaration of 2d array
			int[][] arr;
			
			initialize
			arr=new arr[rows][cells];
		 * */
		int arr[][] = {
				{1,2,3,4},
				{5,6,7,8,1,},
				{9,10,11,12}
						};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
