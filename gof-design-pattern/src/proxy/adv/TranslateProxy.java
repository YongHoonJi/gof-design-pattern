package proxy.adv;

public class TranslateProxy {
	private TranslateClient tclient;
	
	public TranslateProxy(String host, int port){
		this.tclient = new TranslateClient(host, port);
	}
	
	public String translate(String o){
		return this.tclient.translate(o);
	}
}
