package interfaces;

public class australianTraffic implements CentralTraffic,TrainSignal{

	public static void main(String[] args) {

		CentralTraffic a = new australianTraffic();
		a.redstop();
		a.greengo();
		a.yellowwait();
		
		australianTraffic at = new australianTraffic(); //create an Object of australian signal because CentralTraffic have not this method defined its defined to the australianTraffic that is why we should create an object then only we can invoke this method.
		at.handSignal();
		
		TrainSignal ts = new australianTraffic(); //Creating object of another interface 
		ts.trainHorn();
		
		
		
	
	}

	@Override
	public void redstop() {
		// TODO Auto-generated method stub
		
		System.out.println("redstop method implemented");
		
	}

	@Override
	public void greengo() {
		// TODO Auto-generated method stub
		System.out.println("greengo method implemented");

	}

	@Override
	public void yellowwait() {
		// TODO Auto-generated method stub
		System.out.println("yellowwait method implemented");

	}
	
	public void handSignal() {
		System.out.println("handSignal method implemented");

	}

	@Override
	public void trainHorn() {
		// TODO Auto-generated method stub
		System.out.println("trainHorn method implemented");

		
	}

}
