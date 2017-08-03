package mediator.adv;

import java.util.ArrayList;
import java.util.List;

public class ConferenceTelePhone {
	private List<Member> mbl = new ArrayList<>();
	
	public void join(Member c){
		mbl.add(c);
	}
	
	public synchronized void broadcast(String s){
		for(Member m: mbl){
			m.listen(s);
		}
	}
}
