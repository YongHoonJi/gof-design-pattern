package facade.adv;

public class XmlParser implements Parser{

	@Override
	public void parse(String path) {
		System.out.println("parsing xml - "+path);
	}

}
