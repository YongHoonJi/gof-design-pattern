package interpreter.adv2;

public class NodeExpression<T> implements Expression<T>{
	private T t;
	
	public NodeExpression(T t){
		this.t = t;
	}

	@Override
	public T interpret() {
		return t;
	}
	
	
}
