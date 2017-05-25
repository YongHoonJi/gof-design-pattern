package factory.method_pattern;

import factory.obj.ChromeBook;
import factory.obj.Laptop;

public class ChromeBookFactory extends Factory{

	@Override
	public Laptop assemble() {
		ChromeBook l = new ChromeBook("Chrome OS", "Google keyboard");
		l.addExternalVideoCard();
		return l;
	}

}
