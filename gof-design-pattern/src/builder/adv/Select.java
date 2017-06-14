package builder.adv;

import java.util.List;
import java.util.stream.Collectors;

public class Select implements Representative{
	private String s = "select ";
	private List<String> l;
	
	public Select(List<String> l){
		this.l = l;
	}
	
	@Override
	public String get() {
		return s + l.stream().collect(Collectors.joining(",")) + " from ";
	}

}
