package interfaceExample;

public class Car implements Vehicle {
	private String color;
	private int year;
	private int maxSpeed;
	
	public Car(String c, int y, int m) {
		this.color = c;
		this.year = y;
		this.maxSpeed = m;
	}
	
	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void brake() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void steer() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int getMaxSpeed() {
		// TODO Auto-generated method stub
		return this.maxSpeed;
	}
	
	public String toString() {
		String output = "This is a  n";
		return output;
	}
}
