package Abstract;

public abstract class ParentAirCraft {//Make this class abstract because if any method defined as abstract then class must be abstract

	public void engine() {
		System.out.println("Follow engine guidelines");
	}
	public void SafetyGuidelines()
	
	//private void SafetyGuidelines() >> Private specifier could not be defined for the abstract class

	{
		System.out.println("Follow SafetyGuidelines guidelines");

	}
	
	public abstract void bodyColor();//Change to abstract 
}
