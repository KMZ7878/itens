package kaue;

public class Products {
	public String name;
	
	public double price;
	
	public int quantity;

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	public void removeProducts(int quantity){
		this.quantity -= quantity;
	}
	public String toString() {
		return name
			+ ", $"
			+ price
			+ ", "
			+ quantity + " units in stock";
	}
}
