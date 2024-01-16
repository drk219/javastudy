package pkg02_finally;

public class MainClass {

  public static void main(String[] args) {
    
    // finally 블록 : 마지막에 추가할 수 있는 선택 블록으로 항상 실행된다.
    // 예외 발생 여부와 상관없이 항상 마지막에 실행되는 블록임
    // 일반적으로 사용한 자원을 반납(close)하는 용도로 사용함
    
    String userInput = "12.3";
    try{
      
      int number = Integer.parseInt(userInput);
      System.out.println(number);
      
    } catch(NumberFormatException e) {
      
      System.out.println("정수만 입력할 수 있습니다.");
      
    } finally {                                       // 최종 실행되는 finally
      
      System.out.println("작업이 종료되었습니다.");
      
    }

  }

}
