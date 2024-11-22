package StringBufferBuilder;

public class StringBufferBuilderDemo {
	
	public static void main(String[] args) {
		
		String str = "Hello";//Hello - Pool
		str = str+"World";//Hello Word - pool
		
		/* String Buffer & String Builder -> Classes
		 
		 * String Buffer
		 	Mutable - it can be changed
		 	Thread-safe - Synchronized
		 	Slow   
		 * */
		long start= System.currentTimeMillis();
		System.out.println(start);
		StringBuffer sb=new StringBuffer("Hello");
//		System.out.println(sb);
		sb.append(" World");
		System.out.println(sb);
		long end= System.currentTimeMillis();
		System.out.println(end);
		System.out.println("String Buffer time: "+(end-start));
		
		/*
		 String Builder
		 Mutable  - it can also be changed
		 Non-synchronized - multi-threading.
		 Fast
		 
		 * */
		
		long start1= System.currentTimeMillis();
		System.out.println(start1);
		StringBuilder sbd= new StringBuilder("Hi");
		System.out.println(sbd);
		sbd.append(" there!");
		System.out.println(sbd);
		long end1= System.currentTimeMillis();
		System.out.println(end1);
		System.out.println("String Builder time: "+(end1-start1));
		
		sbd.append("this is string builder");
		System.out.println(sbd);
		sbd.insert(3, "all ");
		System.out.println(sbd);
		sbd.delete(4, 10);
		System.out.println(sbd);
		sbd.replace(3, 6, "Danish");
		System.out.println(sbd);
		
//		sbd.reverse();
//		System.out.println(sbd);
		
		System.out.println(sbd.capacity());//length
	}

}
