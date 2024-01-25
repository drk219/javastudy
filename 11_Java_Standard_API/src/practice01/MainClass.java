package practice01;

import java.security.SecureRandom;
import java.time.LocalDate;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.UUID;

public class MainClass {
  
  public static void method1() {  //파일명
    
    // 파일명 만들기
    // 형식 : 하이픈이 제거된 UUID + 밑줄 + 타임스탬프.확장자
    // UUID replace timestamp substring 
    
    String fileName = "apple.jpg";
    String extName = fileName.substring(fileName.lastIndexOf("."));  // .jpg
    StringBuilder builder = new StringBuilder();                     // + 대신
    builder.append(UUID.randomUUID().toString().replace("-", ""));   // - 제거
    builder.append("_");                                             // _ 추가
    builder.append(System.currentTimeMillis());                      // 타임스탬프 추가
    builder.append(extName);                                         // .jpg 추가
    
    // fileName = UUID.randomUUID().toString().replace("-", "");
    // UUID uuid = UUID.nameUUIDFromBytes(fileName.getBytes());
    // String result = uuid.toString();
    // long timestamp = System.currentTimeMillis();
    
    System.out.println(builder);
    
  }
  
  public static Map<String, Object> method2 (String id) {  //나이성별 구하기
    
    // 나이 구하기 + 성별 구하기
    // 나이 : 현재년도 - 태어난 년도
    // 성별 : 하이픈 뒤 숫자가 1,3 이면 남자 / 2,4 이면 여자
        
    // 나이
    // 현재 년도
    int nowYear = LocalDate.now().getYear();   
    
    // 태어난 년도
    int birthYear = 0;
    
    // 하이픈 뒤에 숫자
    int afterHypen = Integer.parseInt(id.substring(0, 2));
    switch(afterHypen) {
      case 1 : 
      case 2 : 
        birthYear = 1900 + Integer.parseInt(id.substring(0, 2));
        break;
      case 3 : 
      case 4 : 
        birthYear = 2000 + Integer.parseInt(id.substring(0, 2));
        break;
    }
    String[] gender = {"여자", "남자"};
        return Map.of("age", nowYear - birthYear, "gender", gender[afterHypen % 2]);
        
        
        /*
          System.out.println(year - bornYear);
          
          // 성별 (1,3 = 남자 / 2,4 = 여자)
          String gender = id.substring(id.lastIndexOf("-"), 1);
          System.out.println(gender);
          if(gender = "1", "3") {
            System.out.println("남자");
          } else {
            System.out.println("여자");
          }
         */
  }

  public static void method3() {  //수도퀴즈
    
    // 각 나라별 수도 맞히기
    
    // 프랑스 수도는? >>> 
    // 파리
    // 스위스 수도는? >>> 
    // 베른
    // 영국 수도는? >>> 
    // 런던
    // 독일 수도는? >>> 
    // 베를린
    // 이탈리아 수도는? >>> 
    // 로마
    // 5개 정답 성공
    
    
    Map<String, String> map = Map.of("프랑스", "파리"
                                       , "독일", "베를린"
                                       , "이탈리아", "로마"
                                       , "스위스", "베른"
                                       , "영국", "런던");
    
    Scanner sc = new Scanner(System.in);
    
    int correctAns = 0;

    for(Entry<String, String> entry : map.entrySet()) {
       System.out.println(entry.getKey() + " 수도는? >>>");
       String capital = sc.next();
       if(capital.trim().equals(entry.getValue())) {
         correctAns++;
       }
    }
    System.out.println(correctAns + "개 정답 성공");
  }

  public static void method4() {  //랜덤출금
    
    // 5000원이 있는 통장(balance)에서 랜덤하게 출금하기
    // 실행예시)
    // 출금 전 5000원, 1회 출금액 2917원, 출금 후 2083원
    // 출금 전 2083원, 2회 출금액 1961원, 출금 후 122원
    // 출금 전 122원, 3회 출금액 102원, 출금 후 20원
    // 출금 전 20원, 4회 출금액 2원, 출금 후 18원
    // 출금 전 18원, 5회 출금액 17원, 출금 후 1원
    // 출금 전 1원, 6회 출금액 1원, 출금 후 0원
    
    Random random = new Random();
    int balance = 5000;
    int nth = 0;
    while (balance > 0) {    // 통장돈이 0보다 크면 계속 반복한다
      int withdrawal = (int)(Math.random() * balance + 1);  // 1 <= 출금 <= 통장금액
      nth++;
      System.out.println("출금 전 " + balance + "원, " + nth + "회 출금액 " + withdrawal + "원, " + "출금 후" + (balance -= withdrawal) + "원");
    
    }
    
  }

  public static void method5() {  //윷놀이
    
    // 윷놀이
    // 실행예시1) "도", 1칸 이동한다.
    // 실행예시2) "개", 2칸 이동한다.
    // 실행예시3) "걸", 3칸 이동한다.
    // 실행예시4) "윷", "도", 5칸 이동한다.
    // 실행예시5) "모", "윷", "도", 10칸 이동한다.
    
    String[] yut = {"", "도", "개", "걸", "윷", "모"};
    StringBuilder builder = new StringBuilder();

    int move = 0;
    int totalMove = 0;
    do {
      move = (int)(Math.random() * 5 + 1);
      totalMove += move; 
      builder.append(yut[move]);
      builder.append(", ");
    } while (move >= 4);
    builder.append(totalMove).append("칸 이동한다.");
    
    System.out.println(builder.toString());
    
  }

  public static void method6() {  //인증번호
    
    // SecureRandom을 이용해 "대문자+소문자+숫자"로 구성된 임의의 인증번호 만들기
    // 실행예시1)
    //   몇 자리의 인증번호를 생성할까요? >>> 4
    //   생성된 4자리 인증번호는 7W5e입니다.
    // 실행예시2)
    //   몇 자리의 인증번호를 생성할까요? >>> 6
    //   생성된 6자리 인증번호는 Fa013b입니다.
    
    Scanner sc = new Scanner(System.in);
    System.out.println("몇 자리의 인증번호를 생성할까요? >>>");
    
    SecureRandom secureRandom = new SecureRandom();
    StringBuilder builder = new StringBuilder();
    int num = sc.nextInt(); 
    
    for(int i = 0; i < num; i++) {                         // num 은 인증번호 자리수
      double code = secureRandom.nextDouble();             // 0.0 <= code < 1.0
      
      // 정수 대문자 소문자 발생 확률 : 33% 33% 34%
      if(code < 0.33) {
        builder.append((secureRandom.nextInt(10)));        // (Int 타입) 0 ~ 9 (10개)
      } else if (code < 0.66) {
        builder.append((char)(secureRandom.nextInt(26) + 'A'));  // 아스키코드 ?? (char 타입으로 변환시키기) A~Z 대문자 (26개)
      } else {
        builder.append((char)(secureRandom.nextInt(26) + 'a'));  // 아스키코드 ?? (char 타입으로 변환시키기) a~z 소문자 (26개)
      }
    }
    
    String result = builder.toString();                    // 생성된 인증코드
    System.out.println("생성된" + num + "자리 인증번호는 " + result + "입니다.");
    sc.close();
    
  }
  
  public static void method7() {  //업다운게임
    
    // 업다운 게임
    // 컴퓨터가 1 ~ 10000 사이의 난수를 발생시킨다.
    // 사용자는 해당 난수를 맞힌다.
    // 실행예시)
    // 입력 >>> 5000
    // Down!
    // 입력 >>> 2500
    // Up!
    // ...
    // 입력 >>> 4500
    // 정답입니다. 총 5번만에 성공했습니다.
    
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    
    int answer = (int)(Math.random() * 10000) + 1;    // 게임의 답 (1~10000 사이 랜덤 추출)
    int count = 0;                                    // 몇번만에 성공 횟수
    int guess = 0;                                    // 입력 답
    
    do {
      System.out.println("입력 >>> ");
      guess = sc.nextInt();
      count++;                               // 입력 횟수 누적
      if(answer == guess) {
        System.out.println("정답입니다. 총 " + count + "번만에 성공했습니다.");
      } else if (guess > answer){            // 입력값 > 답
        System.out.println("Down!");
      } else {                               // 입력값 < 답
        System.out.println("Up!");
      }
    } while (answer != guess);               // 답이 틀리는 동안은 계속 반복해라    
    sc.close();
    
  }
  
  public static void method8() {  //난수그래프
    
    // 0~9 사이 난수를 100개 발생시키고 발생한 난수들이 생성된 횟수(빈도수)를 그래프화 하여 출력하시오.
    // 실행예시)
    // 0 : #### 4
    // 1 : ############ 12
    // 2 : ############ 12
    // 3 : ##### 5
    // 4 : ######## 8
    // 5 : ########### 11
    // 6 : ############ 12
    // 7 : ################## 18
    // 8 : ####### 7
    // 9 : ########### 11
    
    int[] number = new int[100];   // 0~9 각 숫자를 100개 생성
    int[] count = new int[10];     // 0~9 각 숫자 발생 횟수
    
    for (int i = 0; i < number.length; i++) {
      number[i] = (int)(Math.random() * 10);     // 0~9 난수를 생성하여 number 배열의 각 요소에 저장
      count[number[i]]++;                        // 0~9 각 숫자의 발생 횟수 세기
    }
    
    for(int i = 0; i < count.length; i++) {
      StringBuilder builder = new StringBuilder();
      for(int n = 0; n < count[i]; n++) {       // 0~9 빈도수를 #으로 표시
        builder.append("#");
      }
      String graph = builder.toString();  // StringBuilder에 추가된 문자열을 가져와서 문자열 변수 graph 에 저장
      System.out.println(i + " : " + graph + " " + count[i]);
    }
    
  }
  
  public static void method9() {  //빙고판
    
    // 빙고판 만들기 (5 x 5 숫자 빙고판 자동 생성)
    //
    // 지시사항)
    //   1. 1 ~ 25 사이 정수를 2차원 배열 bingo 에 순차적으로 넣는다.
    //      1  2  3  4  5
    //      6  7  8  9 10
    //     11 12 13 14 15
    //     16 17 18 19 20
    //     21 22 23 24 25
    //   2. 25번 서로 섞는다.
    //      순차적으로        랜덤하게
    //      모든요소접근      접근
    //      ----------------------------
    //      bingo[0][0]  <->  bingo[1][4]
    //      bingo[0][1]  <->  bingo[0][2]
    //      bingo[0][2]  <->  bingo[2][1]
    //      ...
    //      bingo[4][4]  <->  bingo[3][1]
    //
    //  실행예시)
    //  10  9  4 25  2
    //  15  3 13 21  1
    //  14 20 11 19  6
    //   8 17  5 12  7
    //  16 22 18 24 23
    
    Random random = new Random();      // 번호를 랜덤으로 돌려
    
    // 빙고 크기
    final int SIZE = 5;
    
    // 빙고판 만들기
    int[][] bingo = new int[SIZE][SIZE];
    
    // 순서대로 초기화
    for(int i = 0; i < SIZE; i++) {
      for(int j = 0; j < SIZE; j++) {
        bingo[i][j] = (i * SIZE) + (j + 1);
      }
    }
    
    // 섞기
    for(int i = 0; i < bingo.length; i++) {
      for(int j = 0; j < bingo.length; j++) {
        bingo[i][j] = (i * bingo.length) + (j + 1);
        System.out.print(String.format("%3d", bingo[i][j]));
      }
      System.out.println();
    }
    
    
  }
  
  
  public static void main(String[] args) {

//    method1();
//    Map<String, Object> map = method2("910219-2123456");
//    for(Entry<String, Object> entry : map.entrySet()) {
//     System.out.println(entry.getKey() + ":" + entry.getValue()); 
//    }
//    method3();
//    method4();
//    method5();
//    method6();
//    method7();
//    method8();
    method9();
    
  }

}
