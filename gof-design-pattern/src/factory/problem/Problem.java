package factory.problem;


import java.util.Optional;

import factory.obj.ChromeBook;
import factory.obj.DefaultBook;
import factory.obj.Laptop;
import factory.obj.MacBook;
import factory.obj.MsSerfice;
import factory.obj.OsType;

public class Problem {
	
	public static void main(String[] args) {
		
		Optional<Laptop> ol = new Problem().assemble(null);
		Laptop laptop = ol.orElse(new DefaultBook("default OS", "default keyboard"));
		System.out.println(laptop.spec());
	}
	
	private Optional<Laptop> assemble(OsType t){
		if(OsType.MAC == t){
			MacBook b = new MacBook("OSX", "keyboard");
			b.addCpu();
			b.addMagicMouse();
			b.addMemory();
			return Optional.of(b);
		}else if(OsType.Chrome == t){
			ChromeBook b = new ChromeBook("Android", "keyboard");
			b.addCpu();
			b.addExternalVideoCard();
			b.addMemory();
			return Optional.of(b);
		}else if(OsType.WINDOWS == t){
			MsSerfice b = new MsSerfice("Android", "keyboard");
			b.addCpu();
			b.addPadMode();
			b.addMemory();
			return Optional.of(b);
		}else{
			return Optional.empty();
		}
	}

}
