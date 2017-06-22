package concept.copy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		Test t = new Test();

		List<ImmutableItem> original = t.getOriginal();
		List<ImmutableItem> t1 = t.getModifiedList(original);
		System.out.println("******** modified list");
		System.out.println(t1);
		System.out.println("******** original");
		System.out.println(original);
		
	}
	
	private List<ImmutableItem> getModifiedList(List<ImmutableItem> original){
		List<ImmutableItem> t1 = new ArrayList<>(original);
		t1.add(new ImmutableItem("Siz", 6));
		t1.remove(2); // remove third item
		return Collections.unmodifiableList(t1);
	}
	
	private List<ImmutableItem> getOriginal(){
		List<ImmutableItem> original = new ArrayList<>();
		original.add(new ImmutableItem("One", 1));
		original.add(new ImmutableItem("Two", 2));
		original.add(new ImmutableItem("Three", 3));
		original.add(new ImmutableItem("Four", 4));
		original.add(new ImmutableItem("Five", 5));
		return Collections.unmodifiableList(original);
	}
	
	// class without setter
	class ImmutableItem {
		private String name;
		private int count;

		public ImmutableItem(String n, int c) {
			this.name = n;
			this.count = c;
		}

		public String getName() {
			return name;
		}

		public int getCount() {
			return count;
		}

		@Override
		public String toString() {
			return this.name + ":" + this.count;
		}

	}

}
