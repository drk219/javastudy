package pkg03_dql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {
  
  /*
   * java.sql.ResultSet
   * 1. SELECT 문의 실행 결과를 처리하는 인터페이스이다.
   * 2. SELECT 문의 결과 행을 하나씩 조회하는 포인터 역할을 수행한다.
   * 3. 주요메소드
   *    1) boolean next() : 결과 행이 있으면 해당 행을 선택하고 true 를 반환, 없으면 false
   *    2) int : getInt(String columnLabel) : ResultSet 포인터가 선택한 결과 행의 칼럼 중 이름이 columnLabel이고 타입이 int 인 값을 반환
   *             getInt(columnIndex) : ResultSet 포인터가 선택한 결과 행의 칼럼 중 순번이 columnIndex이고 타입이 int 인 값을 반환
   */
  
  /*
   ResultSet rs;
   rs.next() 로 한 행씩 읽어낼 수 있다. (true/false 반환함)
   while(rs.next()){ } 로 전체를 읽어낼 수 있다. (리스트)
   if(rs.next()){ } 로 특정 한 데이터 읽어낼 수 있다. (상세)
   rs.next() 의 내용 불러올 때 
   name 으로 검색  rs.getInt("칼럼명") , rs.getString("칼럼명")
   no 로 검색 rs.getInt(번호)
   */
  
  public static void method1() {  // 목록으로 가져와랏
    
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    try {
      
      Class.forName("oracle.jdbc.OracleDriver");
      
      String url = System.getProperty("jdbc.url");
      String user = System.getProperty("jdbc.user");
      String password = System.getProperty("jdbc.password");
      
      con = DriverManager.getConnection(url, user, password);
      
      String sql = "SELECT SAMPLE_NO, SAMPLE_CONTENT, SAMPLE_EDITOR, SAMPLE_DT FROM SAMPLE_T ORDER BY SAMPLE_NO DESC";
          
      ps= con.prepareStatement(sql);
      
      // SELECT 문의 실행 결과는 ResultSet이 처리한다.
      rs = ps.executeQuery();
      
      // SELECT 문의 실행 결과를 행 단위로 조회
      while (rs.next()) {
        
        // rs 포인터가 조회한 행을 SampleDto객체로 만든다.
        SampleDto sampleDto = new SampleDto();
        sampleDto.setSample_no( rs.getInt("SAMPLE_NO"));
        sampleDto.setSample_content( rs.getString("SAMPLE_CONTENT"));
        sampleDto.setSample_editor( rs.getString("SAMPLE_EDITOR"));
        sampleDto.setSample_dt( rs.getDate("SAMPLE_DT"));
        
        System.out.println(sampleDto.getSample_no() + ", " + sampleDto.getSample_content() + ", " + sampleDto.getSample_editor() + ", " + sampleDto.getSample_dt());
        
      }
      
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        if(rs != null) rs.close();
        if(ps != null) ps.close();
        if(con != null) con.close();
      } catch (Exception e2) {
        e2.printStackTrace();
      }
    }
    
  }
  
  public static void method11() {  // 리스트로 
    
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    try {
      
      Class.forName("oracle.jdbc.OracleDriver");
      
      String url = System.getProperty("jdbc.url");
      String user = System.getProperty("jdbc.user");
      String password = System.getProperty("jdbc.password");
      
      con = DriverManager.getConnection(url, user, password);
      
      String sql = "SELECT SAMPLE_NO, SAMPLE_CONTENT, SAMPLE_EDITOR, SAMPLE_DT FROM SAMPLE_T ORDER BY SAMPLE_NO DESC";
          
      ps= con.prepareStatement(sql);
      
      // SELECT 문의 실행 결과는 ResultSet이 처리한다.
      rs = ps.executeQuery();
      
      // List 로 SampleDto 저장
      List<SampleDto> samples = new ArrayList<SampleDto>();

      // SELECT 문의 실행 결과를 행 단위로 조회
      while (rs.next()) {
        
        // rs 포인터가 조회한 행을 SampleDto객체로 만든다.
        SampleDto sampleDto = new SampleDto();
        sampleDto.setSample_no( rs.getInt("SAMPLE_NO"));
        sampleDto.setSample_content( rs.getString("SAMPLE_CONTENT"));
        sampleDto.setSample_editor( rs.getString("SAMPLE_EDITOR"));
        sampleDto.setSample_dt( rs.getDate("SAMPLE_DT"));
        
        // samples 리스트에 sampleDto 객체를 저장한다.
        samples.add(sampleDto);
        
      }

      // 결과 확인
      for(int i = 0, size = samples.size(); i < size; i++) {
        System.out.println( samples.get(i));
      }
      
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        if(rs != null) rs.close();
        if(ps != null) ps.close();
        if(con != null) con.close();
      } catch (Exception e2) {
        e2.printStackTrace();
      }
    }
    
  }

  public static void method2() {
    
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    try {
      
      Class.forName("oracle.jdbc.OracleDriver");
       String url = System.getProperty("jdbc.url");
       String user = System.getProperty("jdbc.user");
       String password = System.getProperty("jdbc.password");
       con = DriverManager.getConnection(url, user, password);
       
       String sql = "SELECT SAMPLE_NO, SAMPLE_CONTENT, SAMPLE_EDITOR, SAMPLE_DT FROM SAMPLE_T WHERE SAMPLE_NO = ?";
       
       ps = con.prepareStatement(sql);
       
       // 변수처리
       Scanner sc = new Scanner(System.in);
       System.out.println("조회할 SAMPLE_NO 입력하세요 >>>");
       int sampleNo = sc.nextInt();
       sc.close();
       
       ps.setInt(1, sampleNo);  // 쿼리문의 1번째 물음표에 sampleNo 전달
       
       // 쿼리문 실행
       rs = ps.executeQuery();
       
       // 결과행을 sampleDto 객체로 만든다.
       SampleDto sampleDto = null;
       
       // 결과 조희
       if(rs.next()) {
         
         sampleDto = new SampleDto();
         sampleDto.setSample_no( rs.getInt(1));
         sampleDto.setSample_content( rs.getString(2));
         sampleDto.setSample_editor( rs.getString(3));
         sampleDto.setSample_dt( rs.getDate(4));
                  
       } 
       
       // 결과 확인
       System.out.println(sampleDto);
       
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        if(rs != null) rs.close();
        if(ps  != null) ps.close();
        if(con != null) con.close();
      } catch (Exception e2) {
        e2.printStackTrace();
      }
    }
    
  }
  
  public static void method3() {
        

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    try {
      
      Class.forName("oracle.jdbc.OracleDriver");
      String url = System.getProperty("jdbc.url");
      String user = System.getProperty("jdbc.user");
      String password = System.getProperty("jdbc.password");
      con = DriverManager.getConnection(url, user, password);
       
      String sql = "SELECT COUNT(*) AS CNT FROM SAMPLE_T";
       
      ps = con.prepareStatement(sql);
       
      // 쿼리문 실행
      rs = ps.executeQuery();
       
      // 결과를 저장할 변수
      int cnt = 0;
       
      // 결과 조희
      if(rs.next()) {
         
        cnt = rs.getInt("CNT");   // 별명이 칼럼명이 된다.
     // cnt = rs.getInt(1);
                  
       } 
       
       // 결과 확인
       System.out.println(cnt);
       
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        if(rs != null) rs.close();
        if(ps  != null) ps.close();
        if(con != null) con.close();
      } catch (Exception e2) {
        e2.printStackTrace();
      }
    }
  
  }
  
  
  public static void main(String[] args) {
    method1();
    method11();
    method3();

  }

}
