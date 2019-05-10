package pbaris;

/**
 * @author Panos Bariamis (pbaris)
 */
public class Circle {

	private double radius;

	private String color;

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

	@Override
	public String toString() {
		return "Circle{" +
			"radius=" + radius +
			", color='" + color + '\'' +
			'}';
	}
}
