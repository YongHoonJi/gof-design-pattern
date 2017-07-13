package proxy.base;

// 대리자 패턴. 대리자에게 복잡하거나 외부 연동을 포함한 일을 위임하는 패턴. 
// 대리자가 큰 파일을 캐쉬하도록 처리한다. 
public class Main {
	public static void main(String[] args) {
		Image image = new ProxyImage("test_10mb.jpg");

		// image will be loaded from disk
		image.display();
		System.out.println("");

		// image will not be loaded from disk
		image.display();
	}
}