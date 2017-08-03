package chain.adv;

public abstract class AbstractBombOwner implements Bomb{
	
	protected AbstractBombOwner next;
	protected int number;
	
	public AbstractBombOwner(int n){
		this.number = n;
	}
	
	public void setNext(AbstractBombOwner o){
		this.next = o;
	}
	
	public void timeToBoom(int n){
		if(n == this.number){
			this.boom();
		}else{
			if(next != null){
				System.out.println("I'm "+this.number+". Hand over to the next.");
				next.timeToBoom(n);
			}else{
				System.out.println("I'm "+this.number+". But there's nothing I can do.");
			}
		}
	}

}
