package factory.method_pattern;

import factory.obj.Laptop;
import factory.obj.MacBook;

public class MacBookFactory extends Factory {

	@Override
	public Laptop assemble() {
		
		MacBook l = new MacBook("OSX", "keyboard");
		l.addMagicMouse();
		return l;
	}

}
