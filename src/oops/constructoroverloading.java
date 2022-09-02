package oops;

public class constructoroverloading {

	
	
	int a=0 ;
	int b=0;
	double c=0;
	
	constructoroverloading()//First Constructor
	{
		a=10;
		b=20;
		c=20.6;
		
	}
	
	constructoroverloading(int x, int y) //Second Constructor
	{
		a=x;
		b=y;
	}
	
	
	constructoroverloading(int x, double y)//Third Constructor
	{
		a=x;
		c =y;
		
	}
	
	
	constructoroverloading(int x, int y, double z)//Fourth Constructor
	{
	a=x;
	b=y;
	c=z;
	
	}
	constructoroverloading(int x, double y, int z)//Fourth Constructor
	{
	a=x;
	b=z;
	c=y;
	
	}
	
	
	void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}
	
	
	public static void main(String[] args) {

		
		//constructoroverloading co=new constructoroverloading();//Call the first constructor
		//constructoroverloading co=new constructoroverloading(10,20);//Call the 2nd constructor
		//constructoroverloading co=new constructoroverloading(20,23.9);//Call the 3rd constructor
		//constructoroverloading co=new constructoroverloading(10,20,20.5);//Call the 4th constructor
		constructoroverloading co=new constructoroverloading(10,20.5,20);//Call the 5th constructor

		co.display();//we call the display method
	}

}
