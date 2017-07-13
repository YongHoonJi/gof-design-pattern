package facade.adv;

public class NewFormatMaker implements Maker{

	private FileInfo f;
	private Parser p;
	public NewFormatMaker(FileInfo f, Parser p){
		this.f = f;
		this.p = p;
	}
	@Override
	public void build() {
		String path = f.getFilePath();
		p.parse(path);
		System.out.println("build complete");
	}

}
