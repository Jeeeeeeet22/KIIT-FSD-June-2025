package day7;

public enum Planet {
	MERCURY(5.0,100.0),
	VENUS(6.0,200.0),
	EARTH(7,300.0),
	MARS(3,200),
	JUPITER(13,2000),
	SATURN(8,1200),
	URANUS(4,500),
	NEPTUNE(3,250);
	
	private double radius;
	private double mass;
	
	private Planet(double radius, double mass) {
		this.radius = radius;
		this.mass = mass;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getMass() {
		return mass;
	}

	public void setMass(double mass) {
		this.mass = mass;
	}
	
	double calculateGravity()
	{
		return this.mass/(this.radius*this.radius);
	}
}
