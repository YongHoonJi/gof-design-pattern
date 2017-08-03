package visitor.base;

public interface ComputerPart {
	public void accept(ComputerPartVisitor computerPartVisitor);
}