package visitor.adv;

public class SalesMan implements Visitor{

	@Override
	public void visit(Building b) {
		System.out.println("visit a "+ b.name());
		
	}

}
