package factory.method_pattern;

import factory.obj.Laptop;
import factory.obj.MsSerfice;

public class MsSerficeFactory extends Factory{

	@Override
	public Laptop assemble() {
		MsSerfice l = new MsSerfice("Windows 10", "Ms keyboard");
		l.addPadMode();
		return l;
	}

}
