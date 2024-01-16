package pkg04_checked;

/*
 * import
 * 다른 패키지에 속한 클래스나 인터페이스를 현재 소스 파일에서 사용할 수 있도록 가져오는 역할
 * 클래스 선언 이전에 위치하며, 
 * 여러 개의 import 문을 사용하여 여러 클래스나 패키지를 한 번에 가져올 수 있습니다. 
 * 다만, 너무 많은 패키지를 모두 가져오면 코드가 혼란스러워질 수 있으므로 
 * 필요한 것만 명시적으로 가져오는 것이 좋습니다.
 */

import java.net.MalformedURLException;      // import 는 상단에 한번만 작성
import java.net.URL;

public class MainClass {

  public static void main(String[] args) {
    
    // checked exception : 'try - catch' 와 같은 예외 처리 코드가 없으면 동작하지 않는 예외이다.
    
    try {
      
      URL url = new URL("https://www.google.com/");
      
    } catch(MalformedURLException e) {
      
      System.out.println("잘못된 URL입니다.");
      
    }

  }

}
