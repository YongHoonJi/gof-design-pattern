package adapter.adv;

//클라이언트의 인터페이스에 맞게 새로운 인터페이스를 호환성있게 변경.
public class Main {
	public static void main(String[] args) {
		Gun g = new Rifle();
		g.shoot();
		
		Gun b = new BazookaAdapter(new Bazooka());
		b.shoot();
	}
}
