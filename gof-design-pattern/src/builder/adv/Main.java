package builder.adv;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Representative s = new Select(Arrays.asList("column_a", "column_b"));
		Representative t = new Table("Patent");
		Predicate p = new Predicate("column_a", " > 100");
		p.and("column_b", " = Y").or("column_c", " != nil");
		Representative w = new Where(p);
		
		// select 
		QueryBuilder builder = QueryBuilderFactory.getBuilder(BuilderType.SELECT);	
		builder.setElement(s, t, w);
		System.out.println(builder.build());
		
		// insert
		Representative s1 = new Insert(Arrays.asList("column_a", "column_b"));
		QueryBuilder builder2 = QueryBuilderFactory.getBuilder(BuilderType.INSERT);
		builder2.setElement(s1, t, w);
		System.out.println(builder2.build());
	}

}
