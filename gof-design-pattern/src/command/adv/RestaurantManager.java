package command.adv;

public class RestaurantManager {
	
	private Command command;
	
	public void setCommand(Command command){
		this.command = command;
	}
	
	public void giveOrders(){
		System.out.print("manager says : ");
		this.command.execute();
	}

}
