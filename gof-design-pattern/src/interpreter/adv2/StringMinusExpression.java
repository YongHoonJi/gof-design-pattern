package interpreter.adv2;

public class StringMinusExpression implements Expression<String>{

	private Expression<String> ex1;
	private Expression<String> ex2;
	
	public StringMinusExpression(Expression<String> ex1, Expression<String> ex2){
		this.ex1 = ex1;
		this.ex2 = ex2;
	}
	
	@Override
	public String interpret() {
		return ex1.interpret().replace(ex2.interpret(), "");
	}

}
