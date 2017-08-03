package command.adv;

public class CookMealCommand implements Command {

	private Task task;
	
	public CookMealCommand(Task t){
		this.task = t;
	}
	
	@Override
	public void execute() {
		this.task.cook();
	}

}
