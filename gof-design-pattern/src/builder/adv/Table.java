package builder.adv;

public class Table implements Representative{
	private String name;
	
	public Table(String n){
		this.name = n;
	}
	
	@Override
	public String get() {
		return this.name;
	}
}
