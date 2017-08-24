package memento.adv;

import java.util.ArrayList;
import java.util.List;

public class MemoryBox {
	
	private List<Diary> dl = new ArrayList<>();
	
	public void put(Diary d){
		this.dl.add(d);
	}
	
	public Diary get(int i){
		return this.dl.get(i);
	}
}
