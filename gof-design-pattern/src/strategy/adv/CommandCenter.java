package strategy.adv;

public class CommandCenter implements Strategy{
	
	private Rush rush;
	
	public CommandCenter(Rush rush){
		this.rush = rush;
	}
	
	public void executeStrategy(){
		this.rush.gogo();
	}

}
