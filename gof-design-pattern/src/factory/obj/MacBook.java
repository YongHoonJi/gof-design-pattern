package factory.obj;

public class MacBook extends Laptop {

	public MacBook(String os, String keyboard) {
		super(os, keyboard);
	}

	@Override
	public void beep() {
		System.out.println("Mac book - "+os.orElse("default os")+","+keyboard.orElse("default keyboard"));
	}

}
