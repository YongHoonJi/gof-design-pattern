package interpreter.adv;

public class Main {
	public static void main(String[] args) {
		Expression ex1 = new IntegerExpression("1000");
		Expression ex2 = new IntegerExpression("100");
		
		MinusExpression minus = new MinusExpression(ex1, ex2);
		System.out.println("minus:"+minus.interpret());
		
		PlusExpression plus = new PlusExpression(ex1, ex2);
		System.out.println("plus:"+plus.interpret());
	}
}
