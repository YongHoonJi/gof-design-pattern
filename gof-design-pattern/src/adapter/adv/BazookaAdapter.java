package adapter.adv;

public class BazookaAdapter implements Gun{
	private Bazooka b;
	public BazookaAdapter(Bazooka b){
		this.b = b;
	}
	@Override
	public void shoot() {
		this.b.throwIt();
	}
}
