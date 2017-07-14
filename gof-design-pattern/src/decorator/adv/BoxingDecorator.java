package decorator.adv;

public class BoxingDecorator extends AbstractDecorator{

	public BoxingDecorator(Candy c) {
		super(c);
	}

	@Override
	public void swindle() {
		this.pack();
		candy.swindle();
	}
	
	private void pack(){
		System.out.println("pack a product.");
	}
	
}
