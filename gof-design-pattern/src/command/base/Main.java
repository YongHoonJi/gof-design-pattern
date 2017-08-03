package command.base;

// 요청을 객체형태로 캡슐화하여 매개변수 등으로 요청에 필요한 정보를 바탕으로 대행 실행 
// 명령(command), 수신자(receiver), 발동자(invoker), 클라이언트(client)
public class Main {
	public static void main(String[] args) {
		// client
		Stock abcStock = new Stock();
		// command
		BuyStock buyStockOrder = new BuyStock(abcStock);
		SellStock sellStockOrder = new SellStock(abcStock);
		// invoker
		Broker broker = new Broker();
		broker.takeOrder(buyStockOrder);
		broker.takeOrder(sellStockOrder);
		
		broker.placeOrders();
	}
}
