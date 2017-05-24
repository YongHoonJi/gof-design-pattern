package factory.method_pattern;

import java.util.Optional;

import factory.obj.Laptop;
import factory.obj.OsType;


public class Main {
	public static void main(String[] args) {
		Optional<Factory> f = FactoryInstance.createInstance(OsType.MAC);
		if(f.isPresent()){
			Laptop l = f.get().assemble();
			l.beep();
		}else{
			System.out.println("No laptop available");
		}
	}
}
