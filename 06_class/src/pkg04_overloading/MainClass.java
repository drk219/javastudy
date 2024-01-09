package pkg04_overloading;    // 인자가 다를때 메소드를 다시 만들어라.

public class MainClass {

  public static void main(String[] args) {

    // calculator 객체 생성
    Calculator calculator = new Calculator();
    
    // Adder 객체 생성
    Adder adder = new Adder();
    
    
    // Calculator 객체 add 메소드 호출
    calculator.add(adder, 10, 20);
    calculator.add(adder, 10, 20, 30);
    calculator.add(adder, 10, 20, 30, 40);
    calculator.add(adder, 1.5, 2.5);
    calculator.add(adder, 1.5, 2.5, 3.5);
    calculator.add(adder, 1.5, 2.5, 3.5, 4.5);
    calculator.add(adder, 1.5, 2.6);
    
  }

}
