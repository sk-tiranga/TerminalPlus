package nested_loop_Pyramid;

public class Pyramid_Tringle {

	public static void main(String[] args) {

		 int K=1;
		for(int i=0; i<4; i++)
		{
			for(int j=1;j<=4-i;j++)
			{
				System.out.print(K);
				System.out.print("\t");
				K++;
			}
			System.out.println(" ");
		}
		
		
		
	}

}
