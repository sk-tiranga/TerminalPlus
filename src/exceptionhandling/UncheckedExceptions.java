package exceptionhandling;

public class UncheckedExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a = 20;
		//System.out.println(a/0);//Arithmetic Exception
		String s =null;
		//System.out.println(s.length()); //NullPointerException
		
		/*String st ="12345";
		int i = Integer.parseInt(st);
		System.out.println(i);*/
		
		
		String st ="abcdef";
		//int i = Integer.parseInt(st);//NumberformatException
		//System.out.println(i);
		int arr[]=new int[5];
		arr[10]=100;//ArrayIndexOutOfBoundsException
	}

}
