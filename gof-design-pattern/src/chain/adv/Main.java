package chain.adv;

public class Main {
	public static void main(String[] args) {

		BombGamer g1 = new BombGamer(10);
		BombGamer g2 = new BombGamer(15);
		BombGamer g3 = new BombGamer(20);
		g1.setNext(g2);
		g2.setNext(g3);
		
		g1.timeToBoom(20);
		g2.timeToBoom(20);
		g3.timeToBoom(10);

	}
}

