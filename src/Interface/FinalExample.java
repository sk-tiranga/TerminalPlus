package Interface;

class Test{
	final int a=10;
	final void m1()
	{
		//a=20;//not valid because a is final
		System.out.println(a);
	}
}


class Test123 extends Test
{
/*	void m1()//not valid because m1 is final method
	{
		//a=20;//not valid because a is final
		System.out.println("m1 is overriden");
	}*/
	
}








public class FinalExample {
	
	
	public static void main(String[] args) {

	}

}
