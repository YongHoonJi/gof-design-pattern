package proxy.adv;

public class Main {
	
	public static void main(String[] args) {
		String org = "원문1";
		TranslateProxy proxy = new TranslateProxy("127.0,0.1", 24);
		System.out.println(proxy.translate(org));	
		
		org = "원문2";
		System.out.println(proxy.translate(org));	
	}
	
}
