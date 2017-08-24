package templateMethod.adv;

// http://www.evernote.com/l/APo0yZUzQ1NAhJtzmuFcjlY6XBj-6jPp02o/

public abstract class AbstractTextFilter implements TextFilter, Remover, Splitter{

	@Override
	public String filter(String s){
		String r = this.split(s); 
		r = this.removeNoise(s);
		return r;
	}

}
