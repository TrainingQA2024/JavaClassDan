package loops;

public class NestedLoops {

	public static void main(String[] args) {
		/*
			20 houses - 10 people
			house - gate - 1
			inside house - 10- laddu distribute
			house - gate - 2
			inside house - 10- laddu distribute
			
		 * */
		
	/*	for(int i=1; i<=20;i++) {		
			//danish
			for(int j=1;j<=10;j++) {
				//friend
				System.out.println("laddu distributed to house no."+i+" Person "+j);
			}
		}			*/
		
/*
 		*
		* *
		* * *
		* * * *
		* * * * *

	*/
		for(int i=1;i<=5;i++) {//i=1

			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}	
	System.out.println("next problem");

	// task table 1 to 5
	/*
	 * 1 x 1= 1 1 x 2= 2 .... 5 x 10= 50
	 */

	/*
	 * 1 2 3 4 5 6 7 8 9
	 */
int count =1;
	for(int i = 1;i<=3;i++)
	{
		for (int j = 1; j <= 3; j++) {
			System.out.print(count+" ");
			count++;
		}
		System.out.println();
	}
}
	
	/*
	
	1 
	2 3
	4 5 6
	7 8 9 10 
	
	 * */

}
