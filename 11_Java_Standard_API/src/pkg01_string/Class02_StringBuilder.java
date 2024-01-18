package pkg01_string;

public class Class02_StringBuilder {

    /*
     *         | StringBuffer    | StringBuilder
     * --------|-----------------|--------------
     *  since  | JDK 1.0         | JDK 1.5
     *  thread | multiple thread | single thread
     *  speed  | slow            | fast
     */
    

  public static void main(String[] args) {
    
    // StringBuilder 객체 생성
    StringBuilder builder = new StringBuilder();
    
    // 문자열 추가하기       += 는 대신해서 append 사용 (+= 는 많이 쌓이면 쓰레기가 늘어난다.)
    builder.append("바");
    builder.append("나");
    builder.append("나");
    
    // String 객체로 바꾸기
    // 1. new String(builder)
    // 2. builder.toString()
    
    String result = builder.toString();
    System.out.println(result);

  }

}
