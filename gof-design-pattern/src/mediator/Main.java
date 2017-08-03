package mediator;
// 중재자 패턴. 비행기의 메세지와 방향을 통제하는 관제탑
public class Main {
	public static void main(String[] args) {
		User robert = new User("Robert");
		User john = new User("John");

		robert.sendMessage("Hi! John!");
		john.sendMessage("Hello! Robert!");
	}
}
