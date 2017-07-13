package decorator.adv;

public class Main {
	public static void main(String[] args) {
		Marshmallow marsh = new Marshmallow();
		Rollipop pop = new Rollipop();
		Candy candyCoated = new CoatingDecorator(pop);
		candyCoated.swindle();
		
		// package decorator
	}
}
