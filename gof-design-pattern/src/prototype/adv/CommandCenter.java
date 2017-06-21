package prototype.adv;

// lazy and synchronized singletone
public class CommandCenter {
	
	private static CommandCenter instance;
	
	public synchronized static CommandCenter getInstance(){
			if(instance == null){
				instance = new CommandCenter();
			}
			return instance;
	}
	
	public Civilian create(ManFactory f){
		return f.recurit();
	}
}
