package factory.obj;

public class MsSerfice extends Laptop{

	public MsSerfice(String os, String keyboard) {
		super(os, keyboard);
	}

	@Override
	public void beep() {
		System.out.println("MS book - "+os+","+keyboard);
	}

}
