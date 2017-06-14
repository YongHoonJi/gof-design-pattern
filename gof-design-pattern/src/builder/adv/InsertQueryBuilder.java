package builder.adv;

public class InsertQueryBuilder implements QueryBuilder {
	private Representative subject;
	private Representative table;
	private Representative where;
	@Override
	public String build() {
		// 복잡한 조립 
		return this.subject.get().replace("${table}", this.table.get()) 
				+ this.where.get();
	}

	@Override
	public void setElement(Representative s, Representative t, Representative w) {
		this.subject = s;
		this.table = t;
		this.where = w;			
	}

}
