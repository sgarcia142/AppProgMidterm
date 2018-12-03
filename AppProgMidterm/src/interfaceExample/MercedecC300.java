package interfaceExample;

public class MercedecC300 extends Car {

	public MercedecC300(String c, int y, int m) {
		super(c, y, m);
	}

	@Override
	public void accelerate() {
		System.out.println("In Mercedes.accelerate()");
		
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
