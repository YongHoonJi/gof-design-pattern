package abstract_factory2;

public class MacBookFactory implements Factory {

	@Override
	public Laptop assemble() {
		return new MacBook("OSX", "Mac keyboard");
	}

}
