package pkg03_one_practice;

public class MainClass {
  
  
  public static void method1() {
    
    /* month    month % 12    month % 12 / 3
     * 12~2        0~2        0
     * 3~5         3~5        1
     * 6~8         6~8        2
     * 9~11        9~11       3
     */
    
    // 월에 따른 계절 출력
    int month = 3;
    String[] seasons = new String[] {"겨울", "봄", "여름", "가을"};
    
    // 코드 한 줄만 추가할 것
      System.out.println(seasons[month % 12 / 3]);
    
  }
  

  public static void method2() {
    
    // 4일은 목요일, n 일 후는 무슨 요일?
    int day = 4;      // 4일은 목요일
    int nDay = 14;    // nDay일 후
    String[] weekNames = new String[] {"일", "월", "화", "수", "목", "금", "토"};  // 요일 (월~일)
    
    // day 의 nDay일 후 
    day += nDay;
    
    // 코드 한 줄만 추가할 것
      System.out.println(weekNames[day % 7] + "요일");
  
  }

  
  public static void method3() {
    
    char[] letters = new char[26];  //아스키코드 32(스페이스)부터 시작, 대문자알파벳은 65(A)부터, 소문자알파벳은 97(a)부터, 숫자는 48(0)부터 시작
    char ch = 'A'; 
    for (int i = 0; i < letters.length; i++) {
      letters[i] = ch++;
      System.out.println(letters[i]);
    }
    
  }
  
  
  public static void method4() {
    
    // 배열 a 의 마지막 3개 요소 배열 b 의 값으로 수정하기
    int[] a = new int[] {10, 20, 30, 40, 50};
    int[] b = new int[] {40, 50, 60};
    
    /*
    a[3] = b[0];
    a[4] = b[1];
    a[5] = b[2];
    */
    
    for(int i = 0; i < b.length; i++) {
      a[3 + i] = b[i];
    }
    
    /*
     * 배열 복사를 위한 자바 표준 api
     * System.arraycopy(b, 0, a, 3, b.length);
     *              =>  b[0] 요소르 a[3] 요소로 복사 (복사시작요소)
     *              복사할 요소 개수 : b.length개 복사
     */
    
    for(int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }
    
  }
  
  
  public static void method5() {  //이해필
    
    // 10진수를 2진수로 변환하기
    
    // 10진수
    int number = 35;

    // 2진수                     
    int[] binary = new int[10];
                                // 2 | 35
                                //   └----
                                // 2 | 17  ... 1 → binary[0]
                                //   └----
                                // 2 |  8  ... 1 → binary[1]
                                //   └----
                                // 2 |  4  ... 0 → binary[2]
                                //   └----
                                // 2 |  2  ... 0 → binary[3]
                                //   └----
                                // 2 |  1  ... 0 → binary[4]
                                //   └----
                                //      0  ... 1 → binary[5]

                                //   ┌---------------------------------------┐
                                //   | 1 | 1 | 0 | 0 | 0 | 1 | 0 | 0 | 0 | 0 |
                                //   └---------------------------------------┘
    int i = 0; 
    while(number > 0) {
      binary[i++] = number % 2;
      number /= 2;  //number = number /2;
    }
    for(int j = i -1; j >= 0; j--) {
      System.out.print(binary[j]);
    }
  
  }
  
  
  public static void main(String[] args) {
    
    method1();
    method2();
    method3();
    //method4();
    method5();
  }

}
