package accessmodifier;

class A
{
	private int i=10;
	private void ma()
	{
		System.out.println(i);
	}
}








public class AccessModifierExample {

	public static void main(String[] args) {

		
		A aobj = new A();
		//aobj.i=10; //Cannot access because its a private variable
		//aobj.m1(); // cannot access because it is a private method
	}

}
