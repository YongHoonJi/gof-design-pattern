package observer.adv;

public class TvObserver implements Observer{
	private News n;
	
	public TvObserver(News n){
		this.n = n;
		this.n.addObserver(this);
	}
	
	@Override
	public void update() {
		System.out.println("news from TV - "+n.getHeadLine());
	}
}
