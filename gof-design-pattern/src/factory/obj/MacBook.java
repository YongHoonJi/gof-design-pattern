package factory.obj;

public class MacBook extends Laptop {

	public MacBook(String os, String keyboard) {
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
	
	public void addMagicMouse(){
		b.append("Magic mouse\n");
	}

}
