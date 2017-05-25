package factory.obj;

import java.util.Optional;

public abstract class Laptop {
	protected Optional<String> os;
	protected Optional<String> keyboard;
	protected StringBuilder b = new StringBuilder();
	
	public Laptop(String os, String keyboard){
		this.os = Optional.ofNullable(os);
		this.keyboard = Optional.ofNullable(keyboard);
	}
	
	public Optional<String> getOs(){
		return this.os;
	}
	
	public Optional<String> getKeyboard(){
		return this.keyboard;
	}
	
	public String spec(){
		return b.toString();
	}
	public abstract void addCpu();
	public abstract void addMemory();
	
}
