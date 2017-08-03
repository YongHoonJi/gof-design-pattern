package flyweight.adv;

import java.util.HashMap;
import java.util.Map;

public class BeverageFactory {
	
	private Map<String, Beverage> cache = new HashMap<>();
	public Beverage get(String b){
		Beverage v = cache.putIfAbsent(b, new Beverage(b));
		System.out.println(cache.size());
		return v;
	}

}
