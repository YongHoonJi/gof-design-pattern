package factory.method_pattern;

import factory.obj.Laptop;
import factory.obj.MacBook;

public class MacBookFactory implements Factory {

	@Override
	public Laptop assemble() {
		return new MacBook("OSX", this.makeDecentKeyboard("OSX"));
	}
	
	private String makeDecentKeyboard(String s){
		return "decent keyboard - "+s;
	}

}
