package visitor.adv;

public class House implements Building{

	@Override
	public String name() {
		return "house";
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
		
	}

}
