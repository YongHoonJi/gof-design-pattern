package builder.adv;

public interface QueryBuilder {
	public String build();
	public void setElement(Representative s, Representative t, Representative w);
}
