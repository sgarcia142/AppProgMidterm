package interfaceExample;

public class Driver {
	public static void main(String[] args) {
		Vehicle v1 = new HondaAccord("red", 1997, 65);
		v1.accelerate();
		System.out.println(v1.getMaxSpeed());
		
		Vehicle v2 = new MercedecC300("white", 2018, 140);
		v1.accelerate();
		System.out.println(v2.getMaxSpeed());
		
		System.out.println(v2);
	}
}
