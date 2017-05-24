package abstract_factory2;

public class ChromeBookFactory implements Factory{

	@Override
	public Laptop assemble() {
		return new ChromeBook("Chrome OS", "Google keyboard");
	}

}
