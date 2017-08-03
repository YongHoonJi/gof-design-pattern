package proxy.adv;

public class TranslateClient {
	public TranslateClient(String host, int port){
		System.out.println("handshake with the server : "+host+":"+port);
	}
	
	public String translate(String o){
		return "translate "+o;
	}

}
