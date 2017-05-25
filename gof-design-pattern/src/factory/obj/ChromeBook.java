package factory.obj;

public class ChromeBook extends Laptop{

	public ChromeBook(String os, String keyboard) {
		super(os, keyboard);
	}

	@Override
	public void addCpu() {
		b.append("CPU\n");
	}

	@Override
	public void addMemory() {
		b.append("Memory\n");
	}
	
	public void addExternalVideoCard(){
		b.append("video card");
	}


}
