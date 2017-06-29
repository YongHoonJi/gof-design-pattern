package composite.adv;

import java.util.ArrayList;
import java.util.List;

public class Officer implements Company{

	private List<Company> com;
	
	public Officer(){
		com = new ArrayList<>();
	}
	
	@Override
	public void speakRank() {
		System.out.println("go forward!");
		com.stream().forEach(s -> s.speakRank());
	}
	
	public void recurit(Company c){
		this.com.add(c);
	}
}
