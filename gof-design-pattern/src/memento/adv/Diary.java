package memento.adv;

public class Diary {
	private String letter;
	
	public void write(String s){
		this.letter = s;
	}
	
	public String read(){
		return this.letter;
	}
}
