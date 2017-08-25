package observer.adv;

public class PaperObserver implements Observer{
	private News n;
	
	public PaperObserver(News n){
		this.n = n;
		this.n.addObserver(this);
	}
	
	@Override
	public void update() {
		System.out.println("news from Paper - "+n.getHeadLine());
	}
}
