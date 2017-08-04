package interpreter.adv;

public class MinusExpression implements Expression{

	private Expression ex1;
	private Expression ex2;
	
	public MinusExpression(Expression ex1, Expression ex2) {
		this.ex1 = ex1;
		this.ex2 = ex2;
	}

	@Override
	public int interpret() {
		return this.ex1.interpret() - this.ex2.interpret();
	}
}
