package factory.obj;

public class MsSerfice extends Laptop{

	public MsSerfice(String os, String keyboard) {
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
	
	public void addPadMode() {
		b.append("pad mode\n");
	}

}
