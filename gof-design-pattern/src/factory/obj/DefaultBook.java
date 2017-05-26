package factory.obj;

public class DefaultBook extends Laptop{

	public DefaultBook(String os, String keyboard) {
		super(os, keyboard);
	}

	@Override
	public void addCpu() {
		b.append("default cpu");
	}

	@Override
	public void addMemory() {
		b.append("default keyboard");
	}

}
