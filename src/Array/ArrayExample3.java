package Array;

public class ArrayExample3 {

	public static void main(String[] args) {

		
		int a[] = {100,200,300,400,500};//We can store any number of elements
		
		int sum = 0;
		
		for(int i:a) {
			System.out.println(i);
			sum=sum+i;
			System.out.println(sum);

		}

}
}