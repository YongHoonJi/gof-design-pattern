package command.adv;
/*
 * Requests need to be handled at variant times or in variant orders
 * The invoker should be decoupled from the object handling the invocation.
 */
public class Main {
	public static void main(String[] args) {
		// Receiver
		Task task = new Task();
		
		// invoker
		RestaurantManager manager = new RestaurantManager();
		
		// concrete command
		WashDishCommand wc = new WashDishCommand(task);
		CookMealCommand cc = new CookMealCommand(task);
		ServeCommand sc = new ServeCommand(task);
		
		manager.setCommand(wc);
		manager.giveOrders();
		
		manager.setCommand(cc);
		manager.giveOrders();

		manager.setCommand(sc);
		manager.giveOrders();
		
	}
	

}
