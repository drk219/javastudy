package pkg03_compare;

public class MainClass {

  public static void main(String[] args) {

    // 비교 연산자
    // 연산 결과는 boolean 타입 -> true / false
    
    int a = 10;
    int b = 20;
    
    System.out.println(a > b);   // a > b 이면 true
    System.out.println(a >= b);  // a >= b 이면 true
    System.out.println(a < b);   // a < b 이면 true
    System.out.println(a <= b);  // a <= b 이면 true
    System.out.println(a == b);  // a 가 b 와 같으면 true
    System.out.println(a != b);  // a 가 b 와 다르면 true
    
    
    // 문자열의 동등 비교는 사용을 금지한다.
    String s1 = "hello";
    String s2 = "hello";
    System.out.println(s1 == s2);  // 결과는 어찌저찌 true 라고 나오지만 사용하면 안된다!!!

    
    
  }

}
