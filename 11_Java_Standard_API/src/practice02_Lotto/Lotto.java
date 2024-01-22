package practice02_Lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Lotto {

  public int buyLotto() throws RuntimeException{
    /**
     * 로또 구매<br>
     * 로또 구매를 위해서 사용자로부터 money 를 입력 받는 메소드<br>
     * 로또 구매 비용은 최소 1000, 최대 100000이다.<br>
     * @return money   사용자가 입력한 로또 구매 비용에서 1000 미만 단위는 버리고 반환. ex) 5999 입력 시 5000 반환
     * @return 0       로또 구매 실패 시 반환
     */
    
    Scanner sc = new Scanner(System.in);
    System.out.println("로또 구매 비용을 입력하세요.");
    
    int money = sc.nextInt();
    if(money >= 1000 && money <= 100000) {    // 구매 가능 금액은 최소 1000 ~ 최대 10000
      money = (money / 1000) * 1000;          // 몫값 * 천원 => 1000 미만 단위는 버리고 반환
      return money;
    } else if (money < 1000){
      throw new RuntimeException("구매 가능한 비용이 부족합니다.");
    } else
      throw new RuntimeException("구매 가능한 비용을 초과했습니다.");
    
    
  }
  
  
  public List<String> generateLotto (int money){
    /**
     * 로또 번호 생성<br>
     * 로또 구매 비용만큼 로또 번호를 생성하는 메소드<br>
     * 5게임씩 끊어서 생성된 로또 번호를 출력한다.<br>
     * @param money   로또 구매 비용
     */
    
    /*
     * 예시) 5000원 구매
     * 
     * 01 : 1  2  3  4  5  6
     * 02 : 1  2  3  4  5  6
     * 03 : 1  2  3  4  5  6
     * 04 : 1  2  3  4  5  6
     * 05 : 1  2  3  4  5  6
     */
    /*
     * 예시) 10000원 구매
     * 
     * 01 : 1  2  3  4  5  6
     * 02 : 1  2  3  4  5  6
     * 03 : 1  2  3  4  5  6
     * 04 : 1  2  3  4  5  6
     * 05 : 1  2  3  4  5  6
     * 
     * 01 : 1  2  3  4  5  6
     * 02 : 1  2  3  4  5  6
     * 03 : 1  2  3  4  5  6
     * 04 : 1  2  3  4  5  6
     * 05 : 1  2  3  4  5  6
     */
    
    Random random = new Random();
    List<String> papers = new ArrayList<String>();  // 로또 영수증 종이에 출력될 로또 배열
    int lottoLine = money / 1000;                   // 출력할 로또 줄 수 = 구매금액 / 천원
    
    for(int i = 0; i < lottoLine; i++) {
      System.out.printf("%02d : ", i + 1);
      Set<Integer> lottoNum = new HashSet<Integer>();
      
      while (lottoNum.size() < 6) {
        int lottoNums =  random.nextInt(45) + 1;    // 번호는 1 ~ 45 중 한개
        lottoNum.add(lottoNums);
      }
      
      for(int number : lottoNum) {
        System.out.print(number + " ");
      }
      System.out.println();
    }
    return papers;
    
  }
  
}
