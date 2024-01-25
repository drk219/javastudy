package pkg01_java_net;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Class03_HttpURLConnection {

  public static void main(String[] args) {
    
    /*
     * HttpURLConnection : try-catch
     * con.disconnect : finally
     */
    
    String spec = "https://www.naver.com/";
    URL url = null;
    HttpURLConnection con = null;
    
    try {
      
      /*
       *  서버  <----  클라이언트 : 요청, request
       *  서버  ---->  클라이언트 : 응답, response
       */
      url = new URL(spec);
      con = (HttpURLConnection) url.openConnection();
      
      
      /*
       * 접속 상태 확인 ( HTTP Response Code : 응답 코드 )
       * 
       * 1xx (정보)            : 요청을 받았으며 프로세스를 계속한다.
       * 2xx (성공)            : 요청을 성공적으로 받았으며 인식했고 수용하였다.
       * 3xx (리다이렉션)      : 요청 완료를 위해 추가 작업 조치가 필요하다.
       * 4xx (클라이언트 오류) : 요청의 문법이 잘못되었거나 요청을 처리할 수 없다.
       * 5xx (서버 오류)       : 서버가 명백히 유효한 요청에 대해 충족을 실패했다.
       */
      int reponseCode = con.getResponseCode();
      if(reponseCode == HttpURLConnection.HTTP_OK) {
        System.out.println("정상 접속");
      } else {
        System.out.println("접속 불가");
      }
      
      
      /*
       * Content-Type
       * Http 통신에서 전송되는 데이터의 타입을 명시하기 위해 header 에 실리는 정보다. 
       * 즉, api 요청 시 request 에 실어 보내는 데이터(body)의 타입 정보다.
       * 종류
       * 1. 문서타입   : text/xxx
       * 2. 이미지타입 : image/xxx
       * 3. 데이터타입 : application/xxx
       * 4. 오디오타입 : audio/xxx
       * ......
       */
      String contentType = con.getContentType();
      System.out.println(contentType);
      
      
      /*
       * 요청 메소드 (Request Method, 요청 방법)
       * 1. GET  : 주소창(URL)을 이용한 데이터 요청. 기본 요청 방식
       *           리소스를 검색하고, 반환받기 위해 사용되는 메소드이다. 
       *           원하는 정보를 서버에 요청할 때 쓰인다.
       *           (일반적으로) 리소스의 위치를 URL에서 쿼리로 표현하기 때문에 RequestBody가 없다.
       * 2. POST : 본문(Body)을 이용한 요청
       *           요청된 자원을 생성하기 위해 사용되는 메소드이다.
       *           POST로 정보를 전송하면 URL에 파라미터가 나타나지 않으므로 각종 데이터를 전송하는데 쓰인다.
       */
      String requestMethod = con.getRequestMethod();
      System.out.println(requestMethod);
      
      
      /*
       * 요청 헤더
       * 요청 정보가 저장된다.
       * 종류
       * 1. User-Agent     : 무엇으로 접속하였는지에 관한 정보
       * 2. Referer        : 이전 접속 주소 정보
       * 3. Content-Type   : 타입
       * 4. Content-Length : 크기
       */
//      Map<String, List<String>> requestHeader = con.getRequestProperties();
//      for(Entry<String, List<String>> entry : requestHeader.entrySet()) {
//        System.out.println(entry.getKey() + " : " + entry.getValue());
//      }
      String userAgent = con.getRequestProperty("User-Agent");
      System.out.println(userAgent);
      String referer = con.getRequestProperty("referer");
      System.out.println(referer);
      
      
    } catch (MalformedURLException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      
      // 접속 해제
      if(con != null)
        con.disconnect();
    }

  }

}
