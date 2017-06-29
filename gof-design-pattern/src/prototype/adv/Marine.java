package prototype.adv;

import composite.adv.Company;

public class Marine extends Civilian implements Cloneable{

	public Marine(){
		System.out.println("progressing...");
	}
	
	@Override
	public void fight() {
		System.out.println("Rock and Roll!");
	}

	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}


}
