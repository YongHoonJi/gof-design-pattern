package prototype.adv;

public class Ghost extends Civilian implements Cloneable{
	
	public Ghost(){
		System.out.println("progressing...");
	}
	
	@Override
	public void fight() {
		System.out.println("Ghost reporting.");
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
