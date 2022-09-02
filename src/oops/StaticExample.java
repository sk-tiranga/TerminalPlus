package oops;

public class StaticExample {
	
	int a ;//non static
	static int b;
	
	static void m1()
	{
		System.out.println("This is m1 - static method");
	}
	void m2()
	{
		System.out.println("This is m1 - non-static method");

	}
	
	void m3()//non static 
	{
		
	a=500;//non static variable	
	b= 1000;
	m1();
	m2();
	}

	public static void main(String[] args) {//Main is static method
//static methods can access static stuff directly .
		
	b=20;
	System.out.println(b);
	m1();
	
	//a=200;    //not accessible because it is non static variable
	//m2();// //not accessible because it is non static method.
		
	StaticExample se = new StaticExample();
	se.a=200;
	System.out.println(se.a);
	
		se.m2();
	}

}
