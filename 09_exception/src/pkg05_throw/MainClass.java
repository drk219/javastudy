package pkg05_throw;

public class MainClass {

  public static void main(String[] args) {
    
    /*
     * throw 
     * 1. 직접 예외 객체를 만들어서 던질 때 사용한다.
     * 2. 자바가 자동으로 던지지 않는 예외들은 개발자가 직접 throw 로 던져줘야 한다.
     * 예외 원인 객체를 전달하고 싶은 경우 또는 자바는 예외로 인식하지 못하지만 실제로는 예외인 경우에 주로 사용
     */
    
    try {
      
      int score = 96;   // 0 ~ 100
      char grade;
      
      if(score < 0 || score > 100) {      // 입력값이 0~100 사이가 아닌 값은 미리 throw 에 던져서 처리
                                          // 잘못된 값이면 바로 캐치로 받고, 올바른 값이면 다음 메소드에 맞는 값을 출력        
        throw new RuntimeException();
        
      }
      
      if(score >= 90)
        grade = 'A';
      else if(score >= 80)
        grade = 'B';
      else if(score >= 70)
        grade = 'c';
      else if(score >= 60)
        grade = 'D';
      else 
        grade = 'F';
      
      System.out.println("점수 : " + score + "점, 학점 : " + grade + "학점");
    
    } catch (Exception e) {
      
      System.out.println("잘못된 점수입니다.");
      
    }

  }

}
