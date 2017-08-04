package interpreter.adv2;

public class IntegerMinusExpression implements Expression<Integer>{
	
	private Expression<Integer> ex1;
	private Expression<Integer> ex2;
	
	public IntegerMinusExpression(Expression<Integer> ex1, Expression<Integer> ex2){
		this.ex1 = ex1;
		this.ex2 = ex2;
	}
	
	@Override
	public Integer interpret() {
		return ex1.interpret() - ex2.interpret();
	}

}
