package observer.adv;

import java.util.ArrayList;
import java.util.List;

public class News {
	
	private List<Observer> obs = new ArrayList<>();
	private String headline;
	
	public void makeHeadLine(String s){
		this.headline = s;
		this.notiAll();
	}
	
	public String getHeadLine(){
		return this.headline;
	}
	
	public void addObserver(Observer o){
		this.obs.add(o);
	}
	
	public void notiAll(){
		obs.stream().forEach(s -> s.update());
	}

}
