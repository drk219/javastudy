package pkg10_static;

public class MainClass {

  public static void main(String[] args) {
    
    // 클래스 멤버 호출 : 클래스.멤버
    
    System.out.println(Calculator.maker);
    
    int number = Integer.parseInt("100");
    System.out.println(number);
    
    Calculator.add(1, 2);
    

  }

}
