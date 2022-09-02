package Interface;

interface Testinteger
{
	int a=10;//by default varibale is static and final
	void display();//abstract method
}





public class InterfaceExample  implements Testinteger
{

public void display()	
{
	System.out.println(a);
}
	
	public static void main(String[] args) {

		
		InterfaceExample ie = new InterfaceExample();
		ie.display();
		
		
	}

}
