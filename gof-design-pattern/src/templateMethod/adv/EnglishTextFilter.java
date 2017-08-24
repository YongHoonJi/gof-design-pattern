package templateMethod.adv;

public class EnglishTextFilter extends AbstractTextFilter {

	@Override
	public String removeNoise(String s) {
		return s.replace(" ", "");
	}

	@Override
	public String split(String s) {
		return s + " eng splitted.";
	}


}
