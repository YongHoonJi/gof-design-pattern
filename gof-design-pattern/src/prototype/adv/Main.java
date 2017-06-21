package prototype.adv;

public class Main {
	public static void main(String[] args) {
		ManFactory b = new Barrack();
		Civilian marine = CommandCenter.getInstance().create(b);
		marine.fight();
		
		Civilian marine2 = CommandCenter.getInstance().create(b);
		marine2.fight();
		
		Civilian marine3 = CommandCenter.getInstance().create(b);
		marine3.fight();
		
		ManFactory a = new Academy();
		Civilian ghost = CommandCenter.getInstance().create(a);
		ghost.fight();
	}

}
