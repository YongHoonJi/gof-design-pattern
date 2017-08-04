package interpreter.adv2;

public class Main {
	public static void main(String[] args) {
		Expression<Integer> ex1 = new NodeExpression<Integer>(100);
		Expression<Integer> ex2 = new NodeExpression<Integer>(10);
		
		IntegerMinusExpression minus = new IntegerMinusExpression(ex1, ex2);
		System.out.println("integer minus:"+minus.interpret());
		
		IntegerPlusExpression plus = new IntegerPlusExpression(ex1, ex2);
		System.out.println("integer plus:"+ plus.interpret());
		
		Expression<String> ex3 = new NodeExpression<String>("apple is mine.");
		Expression<String> ex4 = new NodeExpression<String>("mine");
		
		StringMinusExpression stringMinus = new StringMinusExpression(ex3, ex4);
		System.out.println("string minus:"+stringMinus.interpret());
		
		StringPlusExpression stringPlus = new StringPlusExpression(ex3, ex4);
		System.out.println("string plus:"+ stringPlus.interpret());		
	}
}
