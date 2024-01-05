package pkg04_loop_practice;

public class MainClass {
  
  
  public static void method1() {
    
    
    // 100 ~ 1 출력하기
    
    int n = 100;
    while (n >= 1) {
      System.out.println(n--);
    }
    
  }
  
  
  
  public static void method2() {
    
    
    // 5 ~ 20 사이 모든 정수의 평균 (합계, 개수)
    
    // 방법 1
    int i = 5;
    int total = 0;
    int count = 0;
    
    while (i <= 20) {
      total += i;
      count++;
      i++;
    }
      
    System.out.println(total / count);
    System.out.println(count);
    
    
    // 방법 2
    int begin = 5;
    int end = 20;
    
    int j = begin;
    int sum = 0;
    
    while (j <= end) {
      sum += j;
      j++;
    }
    
    double avg = sum / (end - begin + 1.0);
    System.out.println(avg);
  
    
  }
  
  
  
  public static void method3() {
    // 3단 출력하기
    int dan = 3;
    
    for(int n = 1; n <= 9; n++) {
    
    System.out.println(dan + "x" + n + "=" + dan * n);

    }
  }
  
  
  
  public static void method4() {
    // 70원씩 모금하기
    // 목표는 100000원 이상
    
    // 1회 모금액 70원
    // 2회 모금액 140원
    //      ...
    // n회 모금액 100,000원 이상
    
    int save = 70;
    int total = 0;
    final int GOAL = 100_000;
    int nth = 0;
    
    while(total < GOAL) {
      total += save;
      nth++;      
      
      System.out.println( nth + "회 모금액 " + total + "원");
    }
  }
  

  
  public static void method5() {
    
    // 2x1=2
    // 2x2=4
    //....
    // 5x5=25

    outer:
    for(int dan = 2; dan <= 9; dan++) {
      for(int n = 1; n <= 9; n++) {
      System.out.println(dan + "x" + n + "=" + dan * n);
      if(dan == 5 && n == 5)
        break outer;    // 라벨 달아서 지정한 루프에 브레이크 걸기
      }
    }
  }
  
  
  
  public static void method6() {
    
    // 2x1=1  3x1=3
    // 2x2=4
    // ...
    
    for (int n = 1; n <= 9; n++) {
      for(int dan = 2; dan <= 9; dan++) {
        System.out.print(dan + "x" + n + "=" + dan * n + "\t");
      }
      System.out.println();
    }
  }
  
  
  
  public static void method7() {
    
    /*
     * 삼각별 출력하기-1
     *        star=12345 
     * row=1       * 
     * row=2       ** 
     * row=3       *** 
     * row=4       **** 
     * row=5       *****
     * 
     * row=1, star=1~1 
     * row=2, star=1~2 
     * row=3, star=1~3 
     * row=4, star=1~4 
     * row=5, star=1~5
     * 
     * row=1~5, star1~5
     */
    
    for(int row = 1; row <= 5; row++) {
      for(int star = 1; star <= row; star++) {
        System.out.print("*");
      }
      System.out.println("");
    }
    
  }
  
  
  
  public static void method8() {
    
    /*
     * 삼각별 출력하기-2
     *        star=12345
     * row=1       *****
     * row=2       ****
     * row=3       ***
     * row=4       **
     * row=5       *
     * 
     * row=1, star=1~5
     * row=2, star=1~4
     * row=3, star=1~3
     * row=4, star=1~2
     * row=5, star=1~1
     * 
     * row 1~5, star 1~6-row
     * 
     */
    
    for(int row = 1; row < 6; row++) { 
      for(int star = 1; star <= 6 - row; star++) {
        System.out.print("*");
      }
      System.out.println("");
    }
    
    
    
  }
  
  
  
  public static void method9() {
    
    /*
     * 삼각별 출력하기-3
     * space/star=123456789
     * row=1          *
     * row=2         ***
     * row=3        *****
     * row=4       *******
     * row=5      *********
     * 
     * row=1, space=1~4, star=5~5
     * row=2, space=1~3, star=4~6
     * row=3, space=1~2, star=3~7
     * row=4, space=1~1, star=2~8
     * row=5, space=1~0, star=1~9
     * 
     * row=1~5, space=1~5-row, star=6-row~row+4
     */
    
    for(int row = 1; row < 6; row++) {
      for(int space = 1; space <= 5 - row; space++) {
        System.out.print(" ");
      }
      for(int star = 6- row; star <= row + 4; star++) {
        System.out.print("*");
      }
      System.out.println("");
    }
    
  }
  
  
  
  public static void method10() {
    
    /*
     * 삼각별 출력하기-4
     * space/star=123456789
     * row=1      *********
     * row=2       *******
     * row=3        *****
     * row=4         ***
     * row=5          *
     * 
     * row=1, space=1~0, star=1~9
     * row=2, space=1~1, star=2~8
     * row=3, space=1~2, star=3~7
     * row=4, space=1~3, star=4~6
     * row=5, space=1~4, star=5~5
     * 
     * row 1~5, space=1~row-1, star=row~10-row
     * 
     */
    
    for(int row = 1; row <= 5; row++) {
      for(int space = 1; space <= row - 1; space++) {
        System.out.print(" ");
      }
      for(int star = row; star <= 10 - row; star++) {
        System.out.print("*");
      }
      System.out.println("");
    }
    
  }
  
  
  
  public static void main(String[] args) {
    //method1();
    //method2();
    //method3();
    //method4();
    //method5();
    //method6();
    //method7();
    //method8();
    //method9();
    //method10();

  }

}
