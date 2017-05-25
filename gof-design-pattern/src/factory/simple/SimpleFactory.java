package factory.simple;

import java.util.Optional;

import factory.obj.ChromeBook;
import factory.obj.Laptop;
import factory.obj.MacBook;
import factory.obj.MsSerfice;
import factory.obj.OsType;

public class SimpleFactory {
	public Optional<Laptop> getLaptop(OsType t){
		if(t == OsType.MAC){
			return Optional.of(new MacBook("OSX",null));
		}else if(t == OsType.WINDOWS){
			return Optional.of(new MsSerfice("Windows10", "k"));
		}else if(t == OsType.Chrome){
			return Optional.of(new ChromeBook("Android", "k"));
		}else{
			return Optional.empty();
		}
	}
	
	public static void main(String[] args) {
		Optional<Laptop> l = new SimpleFactory().getLaptop(OsType.MAC);
		System.out.println("keyboard : "+l.get().getKeyboard().orElse("default keyboard"));
		l.get().spec();
		
	}
}
