package visitor.adv;

public class Department implements Building{

	@Override
	public String name() {
		return "department.";
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
		
	}

}
