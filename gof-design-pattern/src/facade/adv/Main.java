package facade.adv;

public class Main {
	public static void main(String[] args) {
		Parser p = new XmlParser();
		FileInfo f = new XmlFileInfo();
		Maker maker = new NewFormatMaker(f, p);
		maker.build();
	}

}
