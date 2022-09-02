package Array;

public class arrayExampleObjectClass {

	public static void main(String[] args) {

		Object a[] = new Object[5];
		a[0]=10;//integer
		a[1]=20.3;//double
		a[2]="Welcome";//String
		a[3]='G';//
		a[4]=true;//boolean
		
		//Object a1[]= {100,200.32,"Raja",'D',false};
		
		for(Object i:a)
		{
			System.out.println(i);

		}
	}

}
