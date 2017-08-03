package command.adv;

public class ServeCommand implements Command {

	private Task task;
	
	public ServeCommand(Task t){
		this.task = t;
	}
	
	@Override
	public void execute() {
		this.task.serve();
	}

}
