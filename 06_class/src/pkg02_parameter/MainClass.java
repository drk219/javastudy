package pkg02_parameter;

public class MainClass {

  public static void main(String[] args) {   // jvm 이 호출함
    
    // 객체 선언 및 생성
    Calculator calculator = new Calculator();
    
    // 메소드 호출
    calculator.method1();           // 주는곳 : 인자, 인수
    
    int a = 10;
    calculator.method2(a);
 
    
    calculator.method3("hello world");
    
    
    calculator.method4(1.5, 1.2);
    
    
    calculator.method5(a);     // method5_2 로 출력하기
    
    
    // 가변 인자  - 같은 타입이라 배열로 출력가능
    calculator.method6(1);
    calculator.method6(1, 2);
    calculator.method6(1, 2, 3);
    
    
    // 배열 인자
    //int[] arr = {10, 20, 30};
    //calculator.method7(arr);
    calculator.method7(new int[] {10, 20, 30});   //new 로 초기화
    
    
    // 객체 인자 : 클래스 필요  **중요, 주로 사용할 것!!!
    // 1. Adder 타입의 adder 객체를 전달
    //Adder adder = new Adder();
    //calculator.method8(adder);
    // 2. Adder 타입의 객제 전달
    calculator.method8(new Adder());   //Adder adder = new Adder(); 와 같음
    
    
    
    
  }

}
