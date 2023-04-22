package excercise5a;

public class Point {
	private final double x;
	private final double y;

	Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	Point() {
		this.x = 0;
		this.y = 0;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public String toString() {
		return String.format("(x: %f, y: %f)", x, y);
	}
}
