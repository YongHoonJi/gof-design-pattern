package memento.adv;

public class Main {
	public static void main(String[] args) {
		Originator org = new Originator();
		MemoryBox box = new MemoryBox();
		Diary d1 = org.saveToMemoryBox("I was an eleven and elementary school boy.");
		box.put(d1);
		org.writeLetter("This will not be saved.");
		System.out.println(org.getLetter());
		
		Diary d2  = org.saveToMemoryBox("I was juvenile and wild.");
		box.put(d2);
		
		System.out.println("saved : "+box.get(0).read());
		System.out.println("saved : "+box.get(1).read());
	}
}
