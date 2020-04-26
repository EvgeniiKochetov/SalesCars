import java.awt.Color;

public class Car {
	static public enum TypeOfEngine {Manual, Auto, Robot};
	
	private Color color;
	private String vin;
	private double price;
	private TypeOfEngine typeEngine ;
	
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
