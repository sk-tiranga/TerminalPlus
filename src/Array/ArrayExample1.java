package Array;

public class ArrayExample1 {

	

	public static void main(String[] args) {

		
int a[] = new int[5];	//declaration of an array	
		
	a[0]=10;	
	a[1]=20;
	a[2]=30;
	a[3]=40;
	a[4]=50;
	/*for (int i=0;i<=4;i++)
	{
		System.out.println(a[i]);*/
	
	for (int i:a)// Classic for loop
	{
		System.out.println(i);
	}
	
	}
	}


