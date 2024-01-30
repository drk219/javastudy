package pkg02_dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class MainClass {
  
  /*
   * java.sql.PreparedStatement
   * 1. 쿼리문을 실행하는 역할을 가진다.
   * 2. PreparedStatement 객체 생성 이전에 쿼리문이 완성되어 있어야 한다.
   * 3. 미리 작성한 쿼리문에 변수 처리가 필요한 경우 "?"를 활용한다.
   * 4. PreparedStatement 객체는 Connection 객체가 생성한다.
   *    PreparedStatement ps = con.PrepareStatement();
   */
  
  public static void method1() {   // 실행은 한번만
    
    // Connection, PreparedStatement 객체 선언
    Connection con = null;
    PreparedStatement ps = null;
    
    try {
      
      // oracle.jdbc.OracleDriver 클래스 로드
      Class.forName("oracle.jdbc.OracleDriver");
      
      // 데이터베이스 접속 정보
      String url = System.getProperty("jdbc.url");
      String user = System.getProperty("jdbc.user");
      String password = System.getProperty("jdbc.password");
      
      // Connection 객체 생성
      con = DriverManager.getConnection(url, user, password);
      
      // 쿼리문 (쿼리문의 끝에 ";" 안쓴다!!)
      String sql = "INSERT INTO SAMPLE_T(SAMPLE_NO, SAMPLE_CONTENT, SAMPLE_EDITOR, SAMPLE_DT) VALUES(SAMPLE_SEQ.NEXTVAL, '콘텐츠', '에디터', CURRENT_DATE)";
      
      // PreparedStatement 객체 생성
      ps = con.prepareStatement(sql);
      
      // 쿼리문 실행. 삽입된 행의 개수가 반환됨.
      int result = ps.executeUpdate();
      System.out.println(result + " 행 이(가) 삽입되었습니다.");
      
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        if(con != null) con.close();
        if(ps != null)  ps.close();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }

  
  }

  
  public static void method2() {  // 입력
    
    Connection con = null;
    PreparedStatement ps = null;
    
    try {
      
      Class.forName("oracle.jdbc.OracleDriver");
      
      String url = System.getProperty("jdbc.url");
      String user = System.getProperty("jdbc.user");
      String password = System.getProperty("jdbc.password");
      con = DriverManager.getConnection(url, user, password);
      
      // 쿼리문에서 변수처리할 부분은 ?로 처리한다.
      String sql = "INSERT INTO SAMPLE_T(SAMPLE_NO, SAMPLE_CONTENT, SAMPLE_EDITOR, SAMPLE_DT) VALUES(SAMPLE_SEQ.NEXTVAL, ?, ?, CURRENT_DATE)";
      
      ps = con.prepareStatement(sql);
      
      // 변수 입력 받기
      Scanner sc = new Scanner(System.in);
      System.out.println("내용 입력하세요 >>>");
      String content = sc.next();
      System.out.println("편집자 입력하세요 >>>");
      String editor = sc.next();
      sc.close();
      
      // 변수를 쿼리문에 전달하기 (스캐너와 물음표 순서대로 맞춰서)
      ps.setString(1, content);  // 쿼리문의 1번째 물음표에 String content 전달하기
      ps.setString(2, editor);   // 쿼리문의 2번째 물음표에 String editor 전달하기
      
      int result = ps.executeUpdate();
      System.out.println(result + " 행 이(가) 삽입되었습니다.");
      
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        if(ps != null)  ps.close();   // 생성의 역순으로 닫기
        if(con != null) con.close();
      } catch (Exception e2) {
        e2.printStackTrace();
      }
    }
    
  }
  
  
  public static void method3() {  // 수정
    
    Connection con = null;
    PreparedStatement ps = null;
    
    try {
      
      Class.forName("oracle.jdbc.OracleDriver");
      
      String url = System.getProperty("jdbc.url");
      String user = System.getProperty("jdbc.user");
      String password = System.getProperty("jdbc.password");
      con = DriverManager.getConnection(url, user, password);
      
      String sql = "UPDATE SAMPLE_T SET SAMPLE_EDITOR = SAMPLE_EDITOR || 2, SAMPLE_DT = CURRENT_DATE WHERE SAMPLE_NO = ?";
      
      ps = con.prepareStatement(sql);
      
      // 수정할 SAMPLE_NO 입력
      Scanner sc = new Scanner(System.in);
      System.out.println("수정할 SAMPLE_NO 입력하세요 >>>");
      int sampleNo = sc.nextInt();
      sc.close();
      
      // 입력값을 쿼리문에 전달
      ps.setInt(1, sampleNo);
      
      int result = ps.executeUpdate();
      System.out.println(result + " 행 이(가) 수정되었습니다.");
      
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        if( ps != null) ps.close();
        if( con != null) con.close();
      } catch (Exception e2) {
        e2.printStackTrace();
      }
    }
    
  }

  
  public static void method4() {  // 삭제
    
    Connection con = null;
    PreparedStatement ps = null;
    
    try {
      
      Class.forName("oracle.jdbc.OracleDriver");
      String url = System.getProperty("jdbc.url");
      String user = System.getProperty("jdbc.user");
      String password = System.getProperty("jdbc.password");
      con = DriverManager.getConnection(url, user, password);
      
      String sql = "DELETE FROM SAMPLE_T WHERE SAMPLE_NO = ?";
      
      ps = con.prepareStatement(sql);
      
      Scanner sc = new Scanner(System.in);
      System.out.println("삭제할 SAMPLE_NO 입력하세요 >>>");
      int sampleNo = sc.nextInt();
      sc.close();
      
      ps.setInt(1, sampleNo);
      
      int result = ps.executeUpdate();
      System.out.println(result + " 행 이(가) 삭제되었습니다.");
      
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        if(ps != null) ps.close();
        if(con != null) con.close();
      } catch (Exception e2) {
        e2.printStackTrace();
      }
    }
  }
  
  
  public static void main(String[] args) {
    method1();
  }

}
