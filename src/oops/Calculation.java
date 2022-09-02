package oops;

public class Calculation {
	
	
	
	int a;
	int b;
	
	// method  does not take parameter 
	
	/*void sum()
	
	{
		
		System.out.println(a+b);
	}*/
	
	
	/*2. Method take parameter*/
	
	void sum(int x, int y)
	{
		a=x;
		b=y;
		
		System.out.println(a+b);
	}
	
	/* 3 Return some value*/
	
	int sum()
	
	{
		return (a+b);
	}
	
	
	public static void main(String[] agrs)
	{
		
		
		Calculation cal = new Calculation();
		cal.a=100;
		cal.b=200;
		cal.sum();
		
	}

}
