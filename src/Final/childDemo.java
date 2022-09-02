package Final;

public class childDemo extends parentDemo {
	
	String name = "Tiranga";
	
	public void getVariableData() {
		
		System.out.println(name);
		System.out.println(super.name);

	}
	
	public childDemo() {	
		
	super();	
		System.out.println("I'm in child class");
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childDemo cd = new childDemo();
		cd.getVariableData();
		
		
		
	}

}
