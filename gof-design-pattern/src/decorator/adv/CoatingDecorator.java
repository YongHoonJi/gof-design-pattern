package decorator.adv;

public class CoatingDecorator extends AbstractDecorator{

	public CoatingDecorator(Candy c) {
		super(c);
	}

	@Override
	public void swindle() {
		chocolateCoating();
		candy.swindle();
		sugarCoating();
	}
	
	private void chocolateCoating(){
		System.out.println("chocolate coating");
	}
	
	private void sugarCoating(){
		System.out.println("sugar coating");
	}

}
