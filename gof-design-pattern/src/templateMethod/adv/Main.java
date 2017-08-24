package templateMethod.adv;

public class Main {

	public static void main(String[] args) {
		TextFilter filter = new KoreanTextFilter();
		String s = "korean-is-a-language-amoung-world-languages.";
		System.out.println(filter.filter(s));
	}
}
