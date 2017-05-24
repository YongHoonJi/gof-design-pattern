package abstract_factory2;

import java.util.Optional;

public class FactoryInstance {
	public static Optional<Factory> createInstance(OsType t){
		if(t == OsType.Chrome){
			return Optional.of(new ChromeBookFactory());
		}else if(t == OsType.MAC){
			return Optional.of(new MacBookFactory());
		}else if(t == OsType.WINDOWS){
			return Optional.of(new MsSerficeFactory());
		}else{
			return Optional.empty();
		}
	}
}
