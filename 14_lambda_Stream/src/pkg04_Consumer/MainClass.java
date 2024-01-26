package pkg04_Consumer;

import java.util.function.Consumer;

public class MainClass {
  
  /*
   * < java.util.function.Consumer >
   * 
   * 1. 형식
   *    public interface Consumer<T> {
   *      void accept (T t);
   *    } 
   * 2. 파라미터 있고, 반환 없는 accept() 메소드를 지원하는 함수형 인터페이스이다.
   */

  public static void method1() {
    
    Consumer<String> consumer = (name) -> System.out.println(name + "님");
    consumer.accept("김다래");
    
  }
  
  public static void method2(Consumer<String> consumer) {   // 추천
    
    consumer.accept("김도롱");
    
  }
  
  
  public static void main(String[] args) {
    method1();
    method2( (name) -> System.out.println(name  + "님") );
  }

}
