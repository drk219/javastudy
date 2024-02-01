package practice02_Lotto;

import java.security.SecureRandom;
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
    System.out.println("Lotto를 얼마나 구입하시겠습니까?(최대 10만원) >>> ");
    int money = sc.nextInt();
    sc.close();
    if(money < 1000 || money > 100000) {
      System.out.println(money + "원 Lotto 구매는 불가능합니다.");
      return 0;
    }
    return money / 1000 * 1000;
    
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
    
    List<String> papers = new ArrayList<String>();  // 로또 영수증 종이에 출력될 로또 배열
    
    while(money > 0) {
      
      // 한 게임 당 1000원
      int game = (money >= 5000) ? 5 : money / 1000;
      
      // 게임 수에 맞는 로또 2차원 배열로 준비
      int[][] lotto = new int[game][6];
      
      // 로또 2차원 배열 1~45 사이 난수 저장하는 for 문
      for(int i = 0; i < game; i++) {
        
        SecureRandom secureRandom = new SecureRandom();
        Set<Integer> set = new HashSet<Integer>();
        while (set.size() != 6) {
          set.add(secureRandom.nextInt(45) + 1);
        }
        
        // 생성한 6개 난수를 lotto 2차원 배열에 저장한다.
        int j = 0;
        for(Integer number : set) {
          lotto[i][j++] = number;
        }
     }
     
      // lotto 2차원 배열의 내용을 String 으로 만들어 StringBuilder 에 저장하는 for 문
      StringBuilder sb = new StringBuilder();
      for(int i = 0; i < game; i++) {
        sb.append(String.format("%02d", i + 1) + " : ");
          for(int j = 0; j < 6; j++) {
            sb.append(String.format("%4d", lotto[i][j]));
          }  
          sb.append("\n");  // 5줄 마다 중간에 공백줄 삽입
      }
    
      // StringBuilder 의 내용을 List papers 에 기록한다.
      papers.add(sb.toString());
      
      money -= 5000;
    }
    
    return papers;
  }
}

//    int lottoLine = money / 1000;                   // 출력할 로또 줄 수 = 구매금액 / 천원
//    
//    for(int i = 0; i < lottoLine; i++) {
//      
//      System.out.printf("%02d : ", i + 1);
//      SecureRandom secureRandom =  new SecureRandom();
//      Set<Integer> lottoNum = new HashSet<Integer>();
//      
//      while (lottoNum.size() < 6) {
//        int lottoNums =  secureRandom.nextInt(45) + 1;    // 번호는 1 ~ 45 중 한개
//        lottoNum.add(lottoNums);
//      }
//      
//      for(int number : lottoNum) {
//        System.out.print(number + " ");
//      }
//      System.out.println();
//    }
//    return papers;