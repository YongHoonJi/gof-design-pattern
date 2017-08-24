package templateMethod.adv;

public class KoreanTextFilter extends AbstractTextFilter {

	@Override
	public String removeNoise(String s) {
		return s.replace("-", " ");
	}

	@Override
	public String split(String s) {
		return s + " splitted";
	}

}
