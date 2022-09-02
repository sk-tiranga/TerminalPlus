package exceptionhandling;

public class ExceptionsExample {
	
public static void main (String[] aggs) {
	
	
	System.out.println("Started");

	//Thread.sleep(4000);//Identified by the compiler [InterruptedException] >> checked exception
	
	int i=10;
	System.out.println(i/0);//ArithmeticException not Identified by the compiler >> Un-checked exception
	
	
	System.out.println("Stopped");

}

}
