package excercise5a;

import static java.lang.Math.PI;

public class Circle {
	private final Point center;
	private final double radius;

	Circle(double x, double y, double radius) {
		this.center = new Point(x, y);
		this.radius = radius;
	}

	Circle(Point point, double radius) {
		this.center = point;
		this.radius = radius;
	}

	public final Point getCenter() {
		return center;
	}

	public final double getRadius() {
		return radius;
	}

	public double area() {
		return PI * radius * radius;
	}

	public String toString() {
		return String.format("Circle centered in %s with radius: %f", center, radius);
	}

}
