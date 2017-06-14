package builder.adv;

public class Where implements Representative{
	private Predicate p;
	
	public Where(Predicate p){
		this.p = p;
	}
	
	@Override
	public String get() {
		return " where "+p.getClauses();
	}
}
