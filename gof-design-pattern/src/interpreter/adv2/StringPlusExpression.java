package interpreter.adv2;

public class StringPlusExpression implements Expression<String>{

	private Expression<String> ex1;
	private Expression<String> ex2;
	
	public StringPlusExpression(Expression<String> ex1, Expression<String> ex2){
		this.ex1 = ex1;
		this.ex2 = ex2;
	}
	
	@Override
	public String interpret() {
		return ex1.interpret() + ex2.interpret();
	}

}
