package cis245homework1;

public class Fan {
	public static final int Slow = 1;
	public static final int Medium = 2;
	public static final int Fast = 3;
	
	private int speed;
	private boolean on;
	private double radius;
	private String color; 
	
	public Fan() {
		speed = Slow;
		on = false;
		radius = 5;
		color = "blue";
	}
	public int getspeed() {
		return speed;
	}
	public void setspeed(int speed) {
		this.speed = speed;
	}
	public boolean isOn() {
		return on; 
	}
	public void setOn(boolean on) {
		this.on = on; 
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		if (on) {
			return "Speed: " + speed + ", Color: " + color + ", Radius: " + radius; 
			
			} else {
				return "Color: " + color + ", Radius: " + radius + ", fan is off";
				
		}
	}
	

}
