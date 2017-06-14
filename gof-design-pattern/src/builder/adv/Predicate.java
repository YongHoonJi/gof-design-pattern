package builder.adv;

public class Predicate {
	private String clauses = "";
	private static String AND = " and ";
	private static String OR = " or ";
	
	public Predicate(String column, String condition){
		clauses += column + " " + condition;
	}
	public Predicate and(String column, String condition){
		clauses += AND + column + " " + condition;
		return this;
	}
	
	public Predicate or(String column, String condition){
		clauses += OR + column + " " + condition;
		return this;
	}
	
	public String getClauses(){
		return this.clauses;
	}
}
