package factory.obj;

public class ChromeBook extends Laptop{

	public ChromeBook(String os, String keyboard) {
		super(os, keyboard);
	}

	@Override
	public void beep() {
		System.out.println("Chrome book - "+os+","+keyboard);		
	}

}
