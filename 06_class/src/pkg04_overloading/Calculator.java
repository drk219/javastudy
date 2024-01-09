package pkg04_overloading;

public class Calculator {
  
  /*
   * 메소드 오버로딩
   * 1. 동일한 클래스에 같은 이름의 메소드가 2개 이상 존재하는 것을 의미한다.
   * 2. 메소드 오버로딩의 규칙
   *    1) 같은 이름의 메소드 / add(~~~), add(~~~)
   *    2) 다른 parameter (개수 또는 타입) / add(int~~), add(double~~)
   * 3. 'System.out.println' 은 여러종류의 메소드 parameter 다 받을 수 있다.
   */
  
  /*
   * int add() {return 1;}
   * double add() {return 1.5;}
   * 이 둘은 오버로딩이 아니다.
   * ()안이 같기 때문에 parameter가 같다.
   * 이 둘은 그냥 반환 타입이 다를뿐이다.
   */
  
  
  void add(Adder adder, int... params) {
    System.out.println(adder.add(params));
  }

  
  void add(Adder adder, double... params) {
    System.out.println(adder.add(params));
  }
  
  
}
