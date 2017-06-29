package composite.adv;

public class Main {
	public static void main(String[] args) {
		Solider s1 = new Solider();
		Solider s2 = new Solider();
		Solider s3 = new Solider();
		Solider s4 = new Solider();
		Officer o1 = new Officer();
		o1.recurit(s1);
		o1.recurit(s2);
		o1.recurit(s3);
		o1.recurit(s4);
		Solider s5 = new Solider();
		Solider s6 = new Solider();
		Officer o2 = new Officer();
		o2.recurit(s5);
		o2.recurit(s6);
		o2.recurit(o1);
		
		o2.speakRank();
		
	}
}
