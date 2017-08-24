package visitor.adv;

public interface Building {
	public String name();
	public void accept(Visitor v);
}
