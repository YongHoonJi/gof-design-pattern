package abstract_factory2;

public class MsSerficeFactory implements Factory{

	@Override
	public Laptop assemble() {
		return new MsSerfice("Windows 10", "Ms keyboard");
	}

}
