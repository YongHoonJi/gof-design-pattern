package strategy.adv;

public class Main {
	public static void main(String[] args) {
		Rush s1 = new BuckerRush();
		Rush s2 = new MarineRush();
		CommandCenter center = new CommandCenter(s1);
		center.executeStrategy();
		
		center = new CommandCenter(s2);
		center.executeStrategy();
	}
}
