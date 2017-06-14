package etc.copy;

import java.io.Serializable;
import java.util.List;

public class ItemWrapper implements Serializable{
	private List<Item> items;
	
	public ItemWrapper(List<Item> items){
		this.items = items;
	}
	
	public List<Item> getItems(){
		return this.items;
	}

}
