package memento.adv;

public class Originator {
	private String letter;
	
	public void writeLetter(String l){
		this.letter = l;
	}
	
	public String getLetter(){
		return this.letter;
	}
	
	public Diary saveToMemoryBox(String l){
		Diary d = new Diary();
		d.write(l);
		return d;
	}
	
	public void getDiaryFromMemoryBox(Diary d){
		this.letter = d.read();
	}
}
