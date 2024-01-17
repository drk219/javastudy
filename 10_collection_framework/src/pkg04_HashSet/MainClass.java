package pkg04_HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MainClass {
  
  public static void method1(){    // HashSet
    
    // HashSet 타입 선언
    Set<String> hobbies;
    
    // HashSet 객체 생성
    hobbies = new HashSet<String>();
    
    // 요소 (순서없이 저장된다, 중복 저장이 불가하다.)
    hobbies.add("공연관람");
    hobbies.add("공연관람");
    hobbies.add("공연관람");
    hobbies.add("농구");
    hobbies.add("낚시");
    hobbies.add("피규어");
    hobbies.add("여행");
    
    // advanced for 문
    for(String hobby : hobbies) {
      System.out.println(hobby);
    }
  }

  
  public static void method2() {   // 교집합
    
    // 교집합
    Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5));
    Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(4, 5, 6, 7, 8));
    
    // set1 이 교집합 결과로 변환된다.
    set1.retainAll(set2);   // set1 에는 4, 5만 있음
    
    System.out.println(set1);
  }
  
  
  public static void method3() {   // 합집합
    
    // 합집합
    Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5));
    Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(4, 5, 6, 7, 8));
    
    // set1 이 합집합 결과로 변환된다.
    set1.addAll(set2);   // set1 에는 1, 2, 3, 4, 5, 6, 7, 8 있음
    
    System.out.println(set1);
  }
  
  
  public static void method4() {   // 차집합
    
    // 차집합
    Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5));
    Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(4, 5, 6, 7, 8));
    
    // set1 이 차집합 결과로 변환된다.
    set1.removeAll(set2);   // set1 에는 1, 2, 3만 있음
    
    System.out.println(set1);
  }
  
  
  public static void main(String[] args) {
    method1();
    method2();
    method3();
    method4();
  }

}
