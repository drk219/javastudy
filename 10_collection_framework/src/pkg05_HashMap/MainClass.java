package pkg05_HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MainClass {
  
  /*
   * HashMap
   * 1. 객체(인스턴스)를 대신할 수 있는 자료구조이다.
   * 2. 구성
   *    1) Key : 데이터 식별자, Set 으로 구성되어 있다. (순서, 중복 없음)
   *    2) Value : 데이터 자체
   *    3) Entry : Key + Value 를 부르는 말이다.
   */

  public static void method1() {   // HashMap(Mutable)
    
    // Mutable 객체(값이 변할 수 있는 객체)
    
    // HashMap 선언
    Map<String, Object> book;
    
    // HashMap 생성
    book = new HashMap<String, Object>();
    
    // Key, Value 추가 (Entry 추가)
    book.put("title", "Little Prince");
    book.put("author", "생텍쥐베리");
    book.put("isBestSeller", true);
    book.put("price", 10000);
    
    // Key 를 이용해서 Value 를 확인하기
    System.out.println("제목 : " + book.get("title"));
    System.out.println("저자 : " + book.get("author"));
    System.out.println((boolean)book.get("isBestSeller") ? "베스트셀러" : "일반서적");
    System.out.println("가격 : " + book.get("price") + "원");
  }
  
  
  public static void method11() {  // 연습
    
    // 연습해보기
    Map<String, Object> song;
    
    song = new HashMap<String, Object>();
    
    song.put("title", "Baddie");
    song.put("artist", "IVE");
    song.put("year", "2023");
    song.put("language", "Korean");
    
    System.out.println("제목 : " + song.get("title"));
    System.out.println("아티스트 : " + song.get("artist"));
    System.out.println("출시연도 : " + song.get("year"));
    System.out.println("언어 : " + song.get("language"));
  }
  
  
  public static void method2() {   // HashMap(Immutable)
    
    // Immutable 객체 (값을 바꿀 수 없는 객체)  :  추가도 안되고, 삭제도 안된다.
    
    Map<String, Object> map = Map.of("name", "홍길동");
    
    // 값을 바꾸려는 시도
    // map.put("age", 10);
    
    System.out.println(map.get("name"));
  }
  
  
  public static void method3() {  // Set Key 활용 
    
    // Key 는 Set 으로 구성되어 있다.
    
    Map<String, Object> map = Map.of("name", "홍길동"
                                   , "age", 10
                                   , "isMarried", false);
    
    Set<String> keys  = map.keySet();
    for(String key : keys) {
      System.out.println(key + ": " + map.get(key));
    }
  }
  
  
  public static void method4() {  // Set Entry 활용
    
    // Entry 전체를 Set 으로 만들 수 있다.
    
    Map<String, Object> map = Map.of("name", "홍길동"
                                   , "age", 10
                                   , "isMarried", false);
    
    Set<Entry<String, Object>> entrySet = map.entrySet();
    
    for(Entry<String, Object> entry : entrySet) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }
  }
  
  
  public static void method5() {  // HashMap 수정 삭제
    
    Map<String, Object> map = new HashMap<String, Object>();
    
    // 처음 입력되는 Key 는 추가된다.
    map.put("name", "홍길동");
    map.put("age", 10);
    map.put("isMarried", false);
    
    // 다시 입력되는 Key 는 수정을 의미한다.
    map.put("age", 20);
    
    // 삭제
    map.remove("isMarried");
    
    System.out.println(map);
  }
  
  
  public static void main(String[] args) {
    method1();
    method11();
    method2();
    method3();
    method4();
    method5();

  }

}
