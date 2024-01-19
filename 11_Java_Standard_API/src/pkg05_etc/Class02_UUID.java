package pkg05_etc;

import java.util.UUID;

public class Class02_UUID {
  
  /*
   * java.util.UUID
   * 1. Universally Unique Identifier
   * 2. 범용 고유 식별자
   * 모든 리소스 중 어떤 리소스를 고유하게 식별할 때 사용하는 레이블
   * 이론상 생성한 UUID는 중복이 있을 수 있지만, 중복 가능성이 거의 없으므로 중복이 없는 것으로 간주함
   * 3. 형식
   *    1) 16진수 32개아 하이픈(-) 4개로 구성
   *    2) 12345678-1234-1234-1234-1234567890ab
   */

  public static void main(String[] args) {
    
    // UUID ver.3
    String name = "김다래";
    UUID uuid1 = UUID.nameUUIDFromBytes(name.getBytes());
    String result1 = uuid1.toString();
    System.out.println(result1);
    
    // UUID ver.4
    UUID uuid2 = UUID.randomUUID();
    String result2 = uuid2.toString();
    System.out.println(result2);

  }

}
