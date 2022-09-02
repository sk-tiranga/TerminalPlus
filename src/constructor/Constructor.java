package constructor;

public class Constructor {
	
	
	public  Constructor() { //If you write public void Constructor() then it will not execute any thing 
		System.out.println("I'm in the constructor");
		System.out.println("I'm in the constructor lecture 1");

	}
	
	//Parameterized constructor
	public  Constructor(int a, int b) { //If you write public void Constructor() then it will not execute any thing 
		System.out.println("I'm in the  parametersized constructorconstructor");

	}
	
	
	public  Constructor(String str) { //If you write public void Constructor() then it will not execute any thing 
		System.out.println("I'm in the String  parametersized Constructor ");

	}	
	public void getData() {
		
		System.out.println("I'm in the method");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructor c = new Constructor();
		Constructor cr = new Constructor(30,20);// IF you not create the object then parameterized  constructor  will not called
		Constructor str = new Constructor("Hello");


	}

}
