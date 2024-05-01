package chap07_class.circle;

public class Circle {
	public final double PI = 3.14;
	public int radius = 0;
	
	public Circle() {
		
	}
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public double circleAround() {
		return 2 * PI * radius;
	}
	
	public double circleArea() {
		return PI * radius * radius;
	}
}
