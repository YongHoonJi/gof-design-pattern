package facade.base;

// Facade (집의 정면, 표면) 복잡한 하위 체계를 단순한 인터페이스로 통합시. 
// 소프트웨어 라이브러리를 쉽게 이해할 수 있게 해 준다
// 공통적인 작업에 대해 간편한 메소드들을 제공해준다.
// 라이브러리 바깥쪽의 코드가 라이브러리의 안쪽 코드에 의존하는 일을 감소 
// 퍼사드는 좋게 작성되지 않은 API의 집합을 하나의 좋게 작성된 API로 감싸준다.
public class Main {

	public static void main(String[] args) {
		ShapeMaker shapeMaker = new ShapeMaker();

		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}

}
