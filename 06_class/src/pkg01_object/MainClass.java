package pkg01_object;

public class MainClass {
  
  public static void method1() {
    
    
    
  }
  

  public static void main(String[] args) {
    
    // 객체 선언
    Calculator calculator;
    
    // 객체 생성
    calculator = new Calculator();
    
    // 객체를 이용해서 클래스의 멤버(필드와 메소드)를 사용할 수 있다.
    // 객체.멤버
    
    calculator.number = 100;  // 필드 호출
    System.out.println(calculator.number);
    
    calculator.method();  // 어느클래스의 뫄뫄메소드야

  }

}
