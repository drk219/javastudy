package pkg04_Writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MainClass {
  
  /*
   * < java.io.FileWriter >
   * 1. 문자 기반의 파일 출력 스트림이다.
   * 2. 출력 단위
   *    1) int
   *    2) char[]
   *    3) String
   */
  
  /*
   * < java.io.BufferedWriter >
   * 1. 버퍼링을 지원하는 문자 출력 스트림이다.
   * 2. 보조 스트림이므로 메인 스트림과 함께 사용해야 한다. 단독 사용은 불가하다.
   * 3. 버퍼링을 지우너하므로 출력 속도가 향상된다.
   * 4. 줄바꿈을 위한 newLine() 메소드가 있다.
   */
  
  /*
   * < java.io.PrintWriter >
   * 1. print 메소드( print(), println(), printf() )를 지원하는 문자 출력 스트림이다.
   * 2. 메인 스트림 또는 보조 스트림으로 사용할 수 있다.
   */
  
  
  public static void method1() {  //FileWriter
    
    File dir = new File("\\storage");
    if (!dir.exists()) {
      dir.mkdirs();
    }
    File file = new File(dir, "sample1.txt");
    
    FileWriter out = null;
    
    try {
      
      out = new FileWriter(file);  //생성모드: 모든 파일을 항상 새로 만든다.
      
      int ch = '대';
      char[] chArr = {'한', '민'};
      String str = "국짱";
      
      out.write(ch);
      out.write(chArr);
      out.write(str);
      
      out.close();
      
    } catch (IOException e) {
      e.printStackTrace();
    }
    
  }
  
  public static void method2() {  //BufferedWriter
    
    File dir = new File("\\storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    File file = new File(dir, "sample2.txt");
    BufferedWriter out = null;
    
    try {
      
      out  = new BufferedWriter(new FileWriter(file, true));  // 추가모드: 파일이 있으면 내용만 추가한다. 없으면 새로 만든다.
      
      /*
       * FileWriter fout =  new FileWriter(file);
       * out = new BufferedWriter(fout);
       * 위 처럼 스트림 생성을 나눠서 만들지않도록 한다.
       * 왜냐하면 나중에 close 에 닫아야할 개수가 늘어난다.
       * 보조만 닫으면 되게 하면 된다.
       */
      
      out.write("안녕하세요");
      out.newLine();
      out.write("반갑습니다");
      out.newLine();
      out.write("저는 김다래라고 합니다");
      out.newLine();
      out.write("당신은요?");
      out.newLine();
      
      out.close();
      
    } catch (IOException e) {
      e.printStackTrace();
    }
    
  }
  
  public static void method3() {  //PrintWriter
    
    File dir = new File("\\storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    File file = new File(dir, "sample3.html");
    
    PrintWriter out = null;
    try {
      
      out = new PrintWriter(file);
      
      out.println("<script>");
      out.println("alert('하이 헬로 안녕');");
      out.println("</script>");
      
      out.close();
      
    } catch (IOException e) {
      e.printStackTrace();
    }
    
  }
  
  
  public static void main(String[] args) {

    method1();
    //method2();
    method3();
    
  }

}
