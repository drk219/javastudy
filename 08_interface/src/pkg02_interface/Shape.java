package pkg02_interface;

/*
 * 인터페이스
 * 1. public final static 상수만 선언할 수 있다.
 *    -> public final static 은 생략할 수 있다.
 * 2. public abstract 추상 메소드만 선언할 수 있다.
 *    -> public abstract 는 생략할 수 있다.
 * 3. jdk 1.8 이후로 추가된 메소드  
 *    1) 디폴트 메소드
 *      public default 반환타입 메소드명(매개변수) {
 *      
 *      }
 *    2) 클래스 메소드
 *      public static 반환타입 메소드명(매개변수) {
 *      
 *      }
 *      
 * <챗GPT>
 * 인터페이스는 메소드의 시그니처만을 선언하고, 구현은 하위 클래스에서 이루어짐
 * 인터페이스는 일반적으로 클래스에서 상속받아 구현하게 되며, implements 키워드를 사용하여 구현
 * 다중 상속을 지원하고, 관련 없는 클래스들에게 공통된 행동을 부여하기 위해 사용
 */

public interface Shape {

  // 상수
  /* public final static */ double PI = 3.141592;
  
  // 추사메소드
  /* public abstract */ double getArea();
  /* public abstract */ double getCircum();
  
  // 디폴트 메소드
  public default void whoami(String name) {
    System.out.println(name);
  }
  
  // 클래스 메소드
  public static void whoami2(String name) {
    System.out.println(name);
  }
  
}
