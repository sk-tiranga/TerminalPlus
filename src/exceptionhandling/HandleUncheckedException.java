package exceptionhandling;

public class HandleUncheckedException {

	public static void main(String[] args) {

		
		int a = 20;
		try
		{
		System.out.println(a/0);//Arithmetic Exception
	}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());

		}
		System.out.println("Program is in progress");
		System.out.println("Program is completed");
		
	}
}
