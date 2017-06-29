package bridge.adv;
// 구현부와 실행부를 디커플
public class BridgeAdvPattern {
	public static void main(String[] args) {
		Gun hgun = new HandyGun();
		Gun rgun = new Rifle();
		Gunner gunner = new GunSlinger(hgun, "piercing");
		gunner.readyBullet();
		gunner.aim();
	}
	
}

class GunSlinger extends Gunner{

	private String bullet;
	public GunSlinger(Gun gun, String bullet) {
		super(gun);
		this.bullet = bullet;
	}

	@Override
	void readyBullet() {
		gun.reload(this.bullet);
	}

	@Override
	void aim() {
		gun.shoot();
	}
}

abstract class Gunner{
	protected Gun gun; // 상속, 패키지 안에서는 visible, not public
	protected Gunner(Gun gun){
		this.gun = gun;
	}
	abstract void readyBullet();
	abstract void aim();
}

interface Gun{
	public void shoot();
	public void reload(String bullet);
}

class HandyGun implements Gun{
	private String bullet;
	@Override
	public void shoot() {
		System.out.println("handy with "+this.bullet);
	}

	@Override
	public void reload(String bullet) {
		this.bullet = bullet;
	}
}

class Rifle implements Gun{
	private String bullet;
	@Override
	public void shoot() {
		System.out.println("rifle with "+this.bullet);
	}

	@Override
	public void reload(String bullet) {
		this.bullet = bullet;
	}
	
}
