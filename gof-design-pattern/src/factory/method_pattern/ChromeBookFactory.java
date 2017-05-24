package factory.method_pattern;

import factory.obj.ChromeBook;
import factory.obj.Laptop;

public class ChromeBookFactory implements Factory{

	@Override
	public Laptop assemble() {
		return new ChromeBook("Chrome OS", "Google keyboard");
	}

}
