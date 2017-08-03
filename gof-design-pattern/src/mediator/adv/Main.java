package mediator.adv;

public class Main {
	public static void main(String[] args) {
		
	ConferenceTelePhone tele = new ConferenceTelePhone();
	Member m1 = new Member("John", tele);
	Member m2 = new Member("Sally", tele);
	Member m3 = new Member("Mike", tele);
	
	tele.join(m1);
	tele.join(m2);
	tele.join(m3);
	
	m1.speak("I'm bored");
	m2.speak("yeah. But it's Friday.");
	m2.speak("I need to have a dring a lot today.");
	
	
	}

}
