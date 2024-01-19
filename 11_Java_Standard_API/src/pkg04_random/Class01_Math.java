package pkg04_random;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Class01_Math {

  public static void main(String[] args) {
    
    /*
     * Math.random() 
     */
    
    // 5% 확률로 "대박"
    if(Math.random() < 0.05) {
      System.out.println("대박");
    } else {
      System.out.println("대박은 무슨");
    }
    
    /*
     * Math.random()                 0.0 <= 난수 < 1.0
     * Math random() * 5             0.0 <= 난수 < 5.0
     * (int)(Math.random() * 5)        0 <= 난수 < 5
     * (int)(Math.random() * 5 + 1)    1 <= 난수 < 6
     */
    
    // 주사위 던지기
    int dice = (int)(Math.random() * 6 + 1);    // 1 ~ 6 중 하나가 발생한다.
    System.out.println(dice);

  }

}
