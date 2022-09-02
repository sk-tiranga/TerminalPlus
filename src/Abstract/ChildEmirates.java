package Abstract;

public class ChildEmirates extends ParentAirCraft{// Add un-inplemented methods

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildEmirates c = new ChildEmirates();
		c.engine();
		c.SafetyGuidelines();
		c.bodyColor();
		
		//ParentAirCraft ac = new ParentAirCraft(); >> If any class which is abstract then we cann't create object of that class
		
		
	}

	@Override
	public void bodyColor() {
		
		System.out.print("Red color of the body");

			}

}
