package pkg07_constructor;

import pkg09_access_modifier.Calculator;

public class MainClass {
  
  
  /*
   * 생성자 
   * 1. Constructor
   * 2. 객체를 생성할 때 동작하는 메소드
   * 3. new 키워드와 함께 사용된다.
   * 4. 특징
   *    1) 생성자는 클래스와 이름이 같다.
   *    2) 객체(또는 클래스)를 이용해서 호출하지 않는다.
   *    3) 반환의 개념 자체가 없다.
   *    4) 매개변수(parameter) 처리는 일반 메소드와 동일하다. -> 생성자 오버로딩이 가능 (여러개를 만들 수 있다.)
   */
  
  /*
   * 디폴트 생성자 (Default Constructor)
   * 1. 생성자가 없는 클래스는 자동으로 디폴트 생성자가 사용된다.
   * 2. 매개변수가 없고, 본문에 실행 코드가 없는 형식이다.
   */

  public static void main(String[] args) {
    
    //computer1 객체 선언 및 생성
    Computer computer1 = new Computer();    // new 와 생성자는 셋뚜셋뚜
    computer1.develop();
    computer1.danggeun();
    
    
    //computer2 객체 선언 및 생성
    Computer computer2 = new Computer("gram", 200);   // 인자(주는쪽)
    computer2.develop();
    computer2.danggeun();
    
    
    
    //Calculator calculator = new Calculator();
    
    //Calculator
    Computer computer3 = new Computer("gram", 200, new Calculator());
    computer3.develop();
    computer3.danggeun();
    computer3.calculator.add();   //calculator 안에 있는 add 를 불러야한다.
    computer3.calculator.add(1);
    computer3.calculator.add(1, 2);
    computer3.calculator.add(1, 2, 3);
    
  }

}
