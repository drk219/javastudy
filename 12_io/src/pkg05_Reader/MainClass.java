package pkg05_Reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {
  
  /*
   * < java.io.FileReader >
   * 1. 문자 기반의 파일 입력 스트림이다.
   * 2. 입력 단위
   *    1) int
   *    2) char[]
   *    3) String
   */
  
  /*
   * < java.io.BufferedReader >
   * 1. 버퍼링을 지원하는 문자 입력 스트림이다.
   * 2. 보조 스트림이므로 메인 스트림과 함께 사용해야 한다. (단독 사용 불가)
   * 3. 버퍼링을 지원하므로 입력 속도가 향상된다.
   * 4. 한 줄씩 읽는 readLine() 메소드가 있다.
   */
  
  /*
   * < java.io.InputStreamReader > 
   * 1. 바이트 기반 입력 스트림인 InputStream 을 문자 기반 입력 스트림인 Reader 로 변환한다.
   * 2. 바이트 입력 스트림으로 문자 데이터가 전달되는 경우 사용한다.
   * 읽기 성능 향상을 위해서 BufferedReader 클래스와 함께 사용할 수 있음
   */
  
  /*
   * < InputStream 에 포함된 문자를 안깨 지고 잘 받기 >
   * 1. InputStreamReader 사용한다.
   * 2. DataInputStream 사용한다.
   */
  
  
  public static void method1() {  //FileReader
    
    File dir = new File("\\storage");
    File file = new File (dir, "sample1.txt");
    
    FileReader in = null;
    
    try {
    
      in = new FileReader(file);
      
      // 읽을 단위
      char[] cbuf = new char[2];
      
      // 읽은 데이터 저장소
      StringBuilder builder = new StringBuilder();
      
      // 읽은 글자수
      int readChar = 0;
      
      // 읽기
      while(true) {
        readChar = in.read(cbuf);
        if(readChar == -1) {
          break;
        }
        builder.append(cbuf, 0, readChar);  //cbuf의 1번째 글자부터 readChar(char[2])만큼 추가한다.
      }
      
      System.out.println(builder.toString());
      
      in.close();
      
    } catch (IOException e) {
      e.printStackTrace();
    }
    
  }
  
  public static void method2() {  //BufferedReader
    
    File dir = new File("\\storage");
    File file  = new File (dir, "sample2.txt");
    
    BufferedReader in = null;
    
    try {
      
      // 생성
      in = new BufferedReader(new FileReader(file));
      
      // 읽는 단위
      String line = null;
     
      // 읽은 데이터 모으기
      StringBuilder builder = new StringBuilder();
      
      // readLine() 메소드는 파일에 끝에 도달하면 null 반환
      /* 
      while(true) {
        line = in.readLine();
        if(line == null) {
          break;
        }
        builder.append(line).append("\n");
      }
      */
      
      while( (line = in.readLine()) != null  ) {
        builder.append(line).append("\n");
      }
      
      System.out.println(builder.toString());
      
      in.close();
      
    } catch (IOException e) {
      e.printStackTrace();
    }
    
  }
  
  public static void method3() {  //InputStreamReader
    
    File dir = new File("\\storage");
    File file  = new File (dir, "sample3.html");
    BufferedReader in = null;
    
    try {
      
      // BufferedReader 생성
      // 바이트 입력 스트림(FileInputStream) -> 문자입력 스트림(InputStreamReader) -> BufferedReader
      
      in = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
      
      // 읽는 단위
      String line = null;
      
      // 읽은 데이터 모으기
      StringBuilder builder = new StringBuilder();
      
      // 읽기
      while((line = in.readLine()) != null) {
        builder.append(line).append("\n");
      }
      
      System.out.println(builder.toString());
      
      in.close();
      
    } catch (IOException e) {
      e.printStackTrace();
    }
    
  }
  
  
  public static void main(String[] args) {
    method1();
    method2();
    method3();
  }

}
