package factory.method_pattern;

import factory.obj.Laptop;

public abstract class Factory {
	public Laptop getLaptop(){
		Laptop l = this.assemble();
		l.addCpu();
		l.addMemory();
		return l;
	}
	protected abstract Laptop assemble();
}
