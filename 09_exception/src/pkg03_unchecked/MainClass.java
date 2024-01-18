package pkg03_unchecked;

public class MainClass {

  public static void main(String[] args) {
    
    // unchecked exception : try - catch 문이 없어도 동작하는 예외 클래스로 RunimeException과 그 자식들을 의미한다.
    
    int mok = 5 / 2;
    
    System.out.println(mok);  // Unchecked Exception 은 예외 처리를 하지 않아도 실행할 수 있으나 실행 중에 예외가 발생할 가능성이 있음 : 예) 5 / 0

  }

}
