package flyweight.base;


// 객체의 중복 생성과 메모리 사용량을 줄이기 위함. 객체 캐쉬 패턴 
public class Main {
	   private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };
	   public static void main(String[] args) {
	      for(int i=0; i < 20; ++i) {
	         Circle circle = (Circle)ShapeFactory.getCircle(getRandomColor());
	         circle.setX(getRandomX());
	         circle.setY(getRandomY());
	         circle.setRadius(100);
	         circle.draw();
	      }
	   }
	   private static String getRandomColor() {
	      return colors[(int)(Math.random()*colors.length)];
	   }
	   private static int getRandomX() {
	      return (int)(Math.random()*100 );
	   }
	   private static int getRandomY() {
	      return (int)(Math.random()*100);
	   }
	}