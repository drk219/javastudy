package pkg02_loop;

public class Class02_for {

  public static void main(String[] args) {
    
    /*
     * for
     * 1. 조건식을 만족하면 반복해서 실행한다.
     * 2. 형식
     *    for (초기상태; 반복조건; 상태변화) { -- 한 줄에 적는다.
     *      실행문
     *    }
     * 3. 실행순서
     *    초기(최초 한번 실행) -> 반복 -> 실행 -> 상태 -> 반복 -> 실행 -> 상태 ...
     */
    
    
    // 1, 2, 3, 4, 5 출력하기
    for ( int n = 1; n <= 5; n++) {
      System.out.println(n);
    }

    
    // n 번 반복하기
    int n = 5;                         // n 번 반복해라
    for ( int i = 0; i < n; i++ ) {    // n 번 보다 작을때까지
      System.out.println("실행문");
    }
    
    
    
    // for 중첩
    for(int day = 1; day <= 5; day ++) {        //outer loop
      System.out.println(day + "일차");
      for(int hour = 1; hour <= 8; hour++) {    //inner loop
        System.out.println(hour + "교시");
      }
    }
    

    
  }

}
