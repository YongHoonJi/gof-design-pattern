package abstract_factory2;

import java.util.Optional;

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
