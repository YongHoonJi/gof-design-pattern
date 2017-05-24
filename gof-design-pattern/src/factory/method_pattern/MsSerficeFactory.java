package factory.method_pattern;

import factory.obj.Laptop;
import factory.obj.MsSerfice;

public class MsSerficeFactory implements Factory{

	@Override
	public Laptop assemble() {
		return new MsSerfice("Windows 10", "Ms keyboard");
	}

}
