package interpreter.adv;

public class IntegerExpression implements Expression{

	private int i;
	
	public IntegerExpression(String s){
		this.i = Integer.parseInt(s);
	}
	
	@Override
	public int interpret() {
		return i;
	}

}
