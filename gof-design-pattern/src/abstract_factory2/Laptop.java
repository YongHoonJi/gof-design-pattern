package abstract_factory2;

public abstract class Laptop {
	protected String os;
	protected String keyboard;
	
	public Laptop(String os, String keyboard){
		this.os = os;
		this.keyboard = keyboard;
	}
	
	public abstract void beep();
}
