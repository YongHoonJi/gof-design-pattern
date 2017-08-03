package command.adv;

public class WashDishCommand implements Command {

	private Task task;
	
	public WashDishCommand(Task t){
		this.task = t;
	}
	
	@Override
	public void execute() {
		this.task.wash();
	}

}
