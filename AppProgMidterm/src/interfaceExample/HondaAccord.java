package interfaceExample;

public class HondaAccord extends Car {
 
	public HondaAccord(String c, int y, int m) {
		super(c, y, m);
	}

	@Override
	public void accelerate() {
		System.out.println("In HondaAccord.accelerate()");
		
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void steer() {
		// TODO Auto-generated method stub
		
	}
	
}
