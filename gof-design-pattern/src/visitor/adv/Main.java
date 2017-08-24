package visitor.adv;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Visitor v = new SalesMan();
		List<Building> bl = new ArrayList<>();
		bl.add(new House());
		bl.add(new Department());
		
		for(Building b: bl){
			b.accept(v);
		}
		
	}
}
