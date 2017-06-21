package prototype.adv;

public class Academy extends ManFactory{
	private Ghost ghost;
	
	public Academy() {
		this.ghost = new Ghost();
	}
	
	@Override
	public Civilian recurit() {
		return (Civilian) this.ghost.clone();
	}

}
