package mediator.adv;

public class Member implements Call{
	private String name;
	private ConferenceTelePhone tele;
	
	public Member(String n, ConferenceTelePhone c){
		this.name = n;
		this.tele = c;
	}
	@Override
	public void speak(String s) {
		tele.broadcast(name + " speak : " + s);
	}
	@Override
	public void listen(String s) {
		System.out.println(this.name + " listen : " + s);
	}

}
