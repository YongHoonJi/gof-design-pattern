package builder.adv;

public class QueryBuilderFactory {
	public static QueryBuilder getBuilder(BuilderType t){
		if(t == BuilderType.SELECT){
			return new SelectQueryBuilder();
		}else{
			return new InsertQueryBuilder();
		}
	}
}
