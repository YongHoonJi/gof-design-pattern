package etc.copy;

import java.io.Serializable;

public class Item implements Cloneable, Serializable {
	private String name;
	private int count;

	public Item(String n, int c) {
		this.name = n;
		this.count = c;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return this.name + ":" + this.count;
	}

	@Override
	public Object clone() {
		Object clone = null;

		try {
			clone = super.clone();

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return clone;
	}

}
