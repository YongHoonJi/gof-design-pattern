package builder.adv;

import java.util.List;
import java.util.stream.Collectors;

public class Insert implements Representative{
	private String s = "insert into ";
	private List<String> l;
	
	public Insert(List<String> l){
		this.l = l;
	}
	
	@Override
	public String get() {
		return s 
			+ "${table} "
			+ "("+ l.stream().collect(Collectors.joining(","))+")"
			+ " values("
			+ l.stream().map(s -> "?").collect(Collectors.joining(","))
			+")";
	}

}
