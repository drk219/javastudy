package pkg06_Predicate;

import java.util.function.Predicate;

public class MainClass {
  
  /*
   * < java.util.function.Predicate >
   * 
   * 1. 형식
   *    public interface Predicate<T> {
   *      boolean test (T t);
   *    } 
   * 2. 파라미터 있고, boolean 반환 있는 test() 메소드를 지원하는 함수형 인터페이스이다.
   */

  public static void method1() {
    
    Predicate<Integer> isEvenNum = (number) -> number % 2 == 0; 
    if(isEvenNum.test(4)) {
      System.out.println("짝수");
    } else {
      System.out.println("홀수");
    }
    
  }
  
  public static void method2(Predicate<Integer> predicate, int number) {   // 추천
    
    if(predicate.test(number)) {
      System.out.println("짝수");
    } else {
      System.out.println("홀수");
    }
    
  }
  
  
  public static void main(String[] args) {
    method1();
    method2( (number) -> number % 2 == 0, 7 );
  }

}
