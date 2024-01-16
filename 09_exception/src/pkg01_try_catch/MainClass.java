package pkg01_try_catch;

public class MainClass {

  public static void method1() {
    
    // 예외 처리가 발생하는 상황
    
    String userInput = "12.3";
    int number = Integer.parseInt(userInput);
    System.out.println(number);
        
  }
  
  
  public static void method2() {
   
    // 예외 처리 : 'try - catch' (try 블록에서 예외를 던지면 catch 블록이 예외를 받는다.)
    // 프로그램에 예외가 생겼을때 자바에서 던지는 오류 발생 메세지 대신 다른 메세지를 입력할 수 있다.
    // 실행할 코드는 try 블록에 두고, 예외를 처리할 코드는 catch 블록에 두는 방식
    
    try{
      
      String userInput = "12.3";
      int number = Integer.parseInt(userInput);
      System.out.println(number);
      
    } catch(NumberFormatException e) {         // e, ex 는 대체로 예외용 변수로 사용함
      
      System.out.println("정수만 입력하세요.");    // 예외발생 메세지 대신 입력한 관련된 메세지가 뜨게 설정하기
      
    }
  }
  
  
  public static void method3() {
    
    String[] userInputs = {"10", "20", "1.5", "2.5", "30"};  // 10 20 는 정상 출력되고, 1.5 2.5는 예외처리메세지, 30은 다시 정상 출력
    
    for(int i = 0; i < userInputs.length; i++) {
      
      try {
        
        int number = Integer.parseInt(userInputs[i]);
        System.out.println(number);
        
      } catch (NumberFormatException e) {
        
        System.out.println(userInputs[i] + "는 정수가 아닙니다.");
        
      }
    }
  }
  
  
  public static void method4() {
    
    // 다중 catch 블록 (순서대로 던져지고 처리됨)
    // 다중 캐치는 상속 관계를 이해하고 만들것! 
    // 자식들의 순서를 위에 먼저 두고 부모를 아래 순서로 나중에 둔다!
    
    String[] userInputs = {"10", "20", "15", "25", "30"};
    
    try {
      
      for(int i = 0; i < 6; i++) {
        
        int number = Integer.parseInt(userInputs[i]);
        System.out.println(number);
        
      }
      
    } catch(NumberFormatException e) {
      
      System.out.println("정수만 처리할 수 있습니다.");
      
    } catch(ArrayIndexOutOfBoundsException e) {
      
      System.out.println("사용할 수 없는 인덱스가 사용되었습니다.");
      
    }
  }
  
  
  public static void main(String[] args) {
   
   // method1();  
   method2();
   method3();
   method4();

  }

}
