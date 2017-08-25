package observer.adv;

public class InternetObserver implements Observer{

	private News n;
	
	public InternetObserver(News n){
		this.n = n;
		this.n.addObserver(this);
	}
	
	@Override
	public void update() {
		System.out.println("news from Internet - "+n.getHeadLine());
	}

}
