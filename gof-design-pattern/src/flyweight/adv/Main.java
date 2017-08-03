package flyweight.adv;

//공유가 가능한 객체를 메모리에 위치시키고 공유. 대표적인 것은 커넥션 풀, 워드프로세서의 폰트 그래픽 
public class Main {
	//  코딩 매크로를 공유
	public static void main(String[] args) {
		BeverageFactory fac = new BeverageFactory();
		fac.get("cola");
		fac.get("fanta");
		fac.get("milk");
		fac.get("beer");
		fac.get("cola");
		fac.get("beer");
	}
	

}
