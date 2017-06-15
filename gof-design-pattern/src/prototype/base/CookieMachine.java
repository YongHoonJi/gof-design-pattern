package prototype.base;

/** Prototype Class **/
/*
 *객체 생성을 위한 일반적인 방법의 비용이 너무 클 경우 
 *프로토타입을 클론하는 방법을 사용한다.
 */
class Cookie implements Cloneable {

   public Object clone() {
      try {
         Cookie copy = (Cookie)super.clone();
         return copy;
      }
      catch(CloneNotSupportedException e) {
         e.printStackTrace();
         return null;
      }
   }
   
   public void yelling(){
	   System.out.println("Crisp");
   }
}

/** Concrete Prototypes to clone **/
class CoconutCookie extends Cookie { }

/** Client Class**/
public class CookieMachine {

   private Cookie cookie;//could have been a private Cloneable cookie;

   public CookieMachine(Cookie cookie) {
      this.cookie = cookie;
   }
   public Cookie makeCookie() {
      return (Cookie)cookie.clone();
   }

   public static void main(String args[]) {
      Cookie tempCookie =  null;
      Cookie prot = new CoconutCookie();
      CookieMachine cm = new CookieMachine(prot);
      for (int i=0; i<100; i++) {
         tempCookie = cm.makeCookie();
         tempCookie.yelling();
      }
      
   }
}
