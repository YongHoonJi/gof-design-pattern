package decorator.adv;

public abstract class AbstractDecorator implements Candy{
	protected Candy candy;
	public AbstractDecorator(Candy c){
		candy = c;
	}
	
	public void swindle(){
		this.candy.swindle();
	}
}
