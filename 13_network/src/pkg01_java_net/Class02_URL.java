package pkg01_java_net;

import java.net.MalformedURLException;
import java.net.URL;

public class Class02_URL {

  public static void main(String[] args) {
    try {
      
      URL url = new URL("https://www.example.com:9090/webtoon/list?page=1&id=100#memo"); // 공백없이 붙여서 작성
                    //프로토콜://     호스트    :포트/    패스    ?   쿼리      #레퍼런스 
      
      System.out.println(url.getProtocol());
      System.out.println(url.getHost());
      System.out.println(url.getPort());
      System.out.println(url.getPath());
      System.out.println(url.getQuery());
      System.out.println(url.getFile());  // path + query
      System.out.println(url.getRef());
      
      // url.openConnection();  웹 리소스에 대한 HTTP 요청을 보낼 수 있다. 이를 통해 데이터를 읽거나 쓸 수 있다
      // url.openStream();  특정 URL과의 연결을 열고, 해당 URL에서 데이터를 읽어오는 InputStream을 반환

    } catch (MalformedURLException e) {
      e.printStackTrace();
    }

  }

}
