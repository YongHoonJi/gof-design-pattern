package chain.adv;

public class BombGamer extends AbstractBombOwner{

	public BombGamer(int n) {
		super(n);
	}

	@Override
	public void boom() {
		System.out.println(this.number + " : Boom!!!!!!");
	}

}
