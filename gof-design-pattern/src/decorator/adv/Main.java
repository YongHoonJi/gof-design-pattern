package decorator.adv;

public class Main {
	public static void main(String[] args) {
		Marshmallow marsh = new Marshmallow();
		Rollipop pop = new Rollipop();
		pop.swindle();
		System.out.println("***** coating ******");
		Candy candyCoated = new CoatingDecorator(pop);
		candyCoated.swindle();
		System.out.println("***** with box ****");
		Candy box = new BoxingDecorator(candyCoated);
		box.swindle();
		// package decorator
	}
}
