package day7;

public class EnumDriver {

	public static void main(String[] args) {
	Planet planet;
	
	planet=Planet.EARTH;
	
	System.out.println("Gravity of " + planet + " is " +planet.calculateGravity());
	
	planet=Planet.JUPITER;
	System.out.println("Gravity of " + planet + " is " +planet.calculateGravity());
	}

}
