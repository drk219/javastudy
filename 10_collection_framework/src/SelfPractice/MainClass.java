package SelfPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MainClass {
  
  public static void method1() {   // HashMap 연습
    
    Map<String, Object> car; 
    
    car = new HashMap<String, Object>();
    
    car.put("brand", "Kia");
    car.put("fuel", "Gasoline");
    car.put("color", "Black");
    car.put("carNo", "4203");
    
    System.out.println("브랜드 : " + car.get("brand"));
    System.out.println("기름종류 : " + car.get("fuel"));
    System.out.println("색깔 : " + car.get("color"));
    System.out.println("차량번호 : " + car.get("carNo"));
    
    car.put("color", "Silver");
    System.out.println(car);
    
    car.remove("carNo");
    System.out.println(car);
  }
  
  
  public static void method2() {   // Set Entry 활용하기
    
    Map<String, Object> quokka = Map.of("name", "Quokka"
                                   , "color", "brown"
                                   , "place", "Australia");
    
    Set<Entry<String, Object>> entrySet = quokka.entrySet();
    for(Entry<String, Object> entry : entrySet) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }
  }
  
  
  public static void main(String[] args) {
    method1();
    method2();
  }

}
