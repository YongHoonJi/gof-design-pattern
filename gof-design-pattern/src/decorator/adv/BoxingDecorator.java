package decorator.adv;

public class BoxingDecorator extends AbstractDecorator{

	public BoxingDecorator(Candy c) {
		super(c);
	}

	@Override
	public void swindle() {
		candy.swindle();
		this.pack();
	}
	
	private void pack(){
		System.out.println("pack a product.");
	}
	
}
