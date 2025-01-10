package exceptionHandling;

public class NestedTryBlock {
	
	public static void main(String[] args) {
	/*	try {
			//line
			try {
				
				try {
					
				}catch(Exception e){}
			}catch(Exception e) {
				//code
				try {
					
				}catch(Exception t) {
					//
				}
			}
		}catch(Exception e) {
			//code
		}*/
		
		try {
//			int a=5/0;
			System.out.println("I am under try block");
			System.exit(0);//JVM shut down - Normally termination- explicitly 
			
		}finally {
			System.out.println("I am finally block");
		}
	}

}
