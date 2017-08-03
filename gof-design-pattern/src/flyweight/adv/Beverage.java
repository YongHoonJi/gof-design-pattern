package flyweight.adv;

public class Beverage {
	public Beverage(String s){
		this.brand = s;
	}
	private String brand;
	
	private String getBrand(){
		return this.brand;
	}
	
}
