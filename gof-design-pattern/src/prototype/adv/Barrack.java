package prototype.adv;

public class Barrack extends ManFactory{
	
	private Marine prototype;
	
	public Barrack(){
		this.prototype = new Marine();
	}
	
	@Override
	public Civilian recurit() {
		return (Civilian) this.prototype.clone();
	}

}
