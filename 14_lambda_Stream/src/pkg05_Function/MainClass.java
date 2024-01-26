package pkg05_Function;

import java.util.function.Function;

public class MainClass {
  
  /*
   * < java.util.function.Function >
   * 
   * 1. 형식
   *    public interface Function<T, R> {
   *      R apply (T t);
   *    } 
   * 2. 파라미터 있고, 반환 있는 apply() 메소드를 지원하는 함수형 인터페이스이다.
   */

  public static void method1() {
    
    Function<String, String> function = (name) -> name + "님";
    System.out.println(function.apply("김다래"));
    
  }
  
  public static void method2(Function<String, String> function) {   // 추천
    
    System.out.println(function.apply("김도롱"));
    
  }
  
  
  public static void main(String[] args) {
    method1();
    method2( (name) -> name + "님" );
  }

}
