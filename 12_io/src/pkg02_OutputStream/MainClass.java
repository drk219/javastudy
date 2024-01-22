package pkg02_OutputStream;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.List;

public class MainClass {
  
  /*
   * java.io.FileOutputStream
   * 1. 바이트 기반의 파일 출력 스트림이다.
   * 2. 출력 단위
   *    1) int (1 바이트만 내보낼때 사용) - 한개
   *    2) byte[]                         - 여러개
   */
  
  /*
   * java.io.BufferedOutputStream
   * 1. 버퍼링을 지원하는 바이트 출력 스트림이다.
   * 2. 보조 스트림으로 메인 스트림과 함께 사용해야 한다. (단독 사용 불가)
   * 3. 버퍼링을 지원하므로 출력 속도가 향상된다.
   */
  
  /*
   * java.io.DataOutputStream
   * 1. 자바 변수 값을 출력하는 바이트 출력 스트림이다.
   * 2. 보조 스트림으로 메인 스트림과 함께 사용해야 한다.
   * 3. 타입 별로 전용 메소드가 존재한다.
   */
  
  /*
   * java.io.ObjectOutputStream
   * 1. 객체를 출력하는 바이트 출력 스트림이다.
   * 2. 보조 스트림으로 메인스트림과 함게 사용해야 한다.
   * 3. 객체를 출력 스트림으로 전송하기 위해서는 직렬화 과정이 필요하다.
   * 4. 직렬화 방법
   *    1) 직렬화할 클래스는 java.io.Serializable 인터페이스를 구현한다. (필수)
   *    2) long serialVersionUID 필드 값을 임의로 생성한다.
   */
  
  public static void method1() {
    
    // 무조건 생성 모드 : 기존에 파일이 있으면 지우고 다시 만든다.
    
    // 디렉토리 지정
    File dir = new File("\\storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    
    // 파일
    File file = new File(dir, "sample1.dat");
    
    // 파일 출력 스트림 선언
    FileOutputStream out = null;
    
    // 생성
    try {
      
      // 파일 출력 스트림 생성 (무조건 생성 모드 : 코드는 따로 없지만 생성하면 무조건 덮어쓴다)
      out = new FileOutputStream(file);
      
      //출력할 데이터
      int c = 'A';
      String str = "pple";
      byte[] b = str.getBytes();
      
      // 출력
      out.write(c);
      out.write(b);
      
      // 플러싱 Flushing (선택)
      out.flush();
      
      
      // 확인
      System.out.println(file.length() + "바이트 크기의 " + file.getPath() + " 파일이 생성되었습니다.");
    
    } catch (Exception e) {
      e.printStackTrace();
      } finally {
      
      try {
        // 파일 출력 스트림 닫기(종료)
        if(out != null)  
          out.close();   // 'IOException'이 꼭 필요하기 때문에 다시 try-catch안에 넣어줘야한다.
      } catch (Exception e2) {
        e2.printStackTrace();
        }
    }
        
  }
  
  public static void method2() {
    
    // 추가 모드 : 기존 파일이 없으면 
    
    // 안녕하세요 반갑습니다 -> sample2.dat 파일로 보내기
    
    File dir = new File("\\storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    
    File file =  new File(dir, "sample2.dat");
    
    FileOutputStream out = null;
    
    try {
      
      // 파일 출력 스트림 생성(추가 모드)  
      out = new FileOutputStream(file, true);   // '안녕하세요 반갑습니다.' 가 계속 추가로 생성된다.
      
      String str = "안녕하세요 반갑습니다.\n";
      byte[] b = str.getBytes();
      
      out.write(b);
      
      out.flush();
      
      System.out.println(file.length() + "바이트 크기의 " + file.getPath() + " 파일이 생성되었습니다.");
      
    } catch (Exception e) {
      e.printStackTrace();
    }

    
  }
  
  public static void method3() {   // 안보고 혼자 완성할 수 있도록!!!!!!!!
    
    File dir = new File("\\storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    File file = new File(dir, "sample3.dat");
    
    // 버퍼 출력 스트림 선언
    BufferedOutputStream out = null;
    
    try {
      
      // 버퍼 출력 스트림 생성
      out = new BufferedOutputStream(new FileOutputStream(file));
      
      // 출력할 데이터
      String str1 = "How do you do? Nice to meet you.\n";
      String str2 = "I'm fine thank you, and you?";
      
      // 출력
      out.write(str1.getBytes());
      out.write(str2.getBytes());
      
      // 버퍼 출력 스트림 닫기
      out.close();
      
      // 확인
      System.out.println(file.length() + "바이트 크기의 " + file.getPath() + " 파일이 생성되었습니다.");
      
    } catch (Exception e) {
      e.printStackTrace();
    }
    
    
  }
  
  public static void method4() {
    
    File dir = new File("\\storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    File file = new File(dir, "sample4.dat");
    DataOutputStream out = null;
    
    try {
      out = new DataOutputStream(new FileOutputStream(file));
      
      String name = "홍길동";
      int age = 10;
      double height = 140.5;
      boolean isAdult = (age >= 20);
      char gender = '남';
      
      out.writeUTF(name);
      out.writeInt(age);
      out.writeDouble(height);
      out.writeBoolean(isAdult);
      out.writeChar(gender);
      
      out.close();
      
      System.out.println(file.length() + "바이트 크기의 " + file.getPath() + " 파일이 생성되었습니다.");
      
    } catch (Exception e) {
      e.printStackTrace();
    }
    
  }
  
  public static void method5() {
    
    File dir = new File("\\storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    File file = new File(dir, "sample5.dat");
    ObjectOutputStream out = null;
    
    try {
      out = new ObjectOutputStream(new FileOutputStream(file));
      Employee employee = new Employee(1, "홍길동");
      List<Employee> employees = Arrays.asList(new Employee(2, "홍길순"), new Employee(3, "나길동"));
      
      out.writeObject(employee);
      out.writeObject(employees);
      
      out.close();
      System.out.println(file.length() + "바이트 크기의 " + file.getPath() + " 파일이 생성되었습니다.");
      
    } catch (Exception e) {
      e.printStackTrace();
    }
    
  }
  
  public static void main(String[] args) {
    method1();
//    method2();
    method3();
    method4();
    method5();
    practice1();
    practice2();
  }
  
  
  public static void practice1() {
    
    // FileOutputStream 으로 애국가 1절 파일로 보내기 : 시간재기
    // System.nanoTime();
    
    File dir = new File("\\storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    File file = new File (dir, "National_anthem1.dat");
    FileOutputStream out = null;
    
    try {
      out = new FileOutputStream(file);
      
      long start = System.nanoTime();
      String str1 = "동해물과 백두산이 마르고 닳도록\n";
      String str2 = "하느님이 보우하사 우리나라 만세\n";
      String str3 = "무궁화 삼천리 화려강산\n";
      String str4 = "대한 사람 대한으로 길이 보전하세";
      
      out.write(str1.getBytes());
      out.write(str2.getBytes());
      out.write(str3.getBytes());
      out.write(str4.getBytes());
      long end = System.nanoTime();
      out.close();
      
      System.out.println(file.length() + "바이트 크기의 " + file.getPath() + " 파일이 생성되었습니다.");
      System.out.println((end-start) + "ns 소요됨");
      
    } catch (Exception e) {
      e.printStackTrace();
    }

  }
  
  public static void practice2() {
    
    // BufferedOuputStream 으로 애국가 1절 파일로 보내기 : 시간재기
    // System.nanoTime();
    
    File dir = new File("\\storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    File file = new File (dir, "National_anthem2.dat");
    BufferedOutputStream out = null;
    
    try {
      out = new BufferedOutputStream(new FileOutputStream(file));
      
      long start = System.nanoTime();
      String str1 = "동해물과 백두산이 마르고 닳도록\n";
      String str2 = "하느님이 보우하사 우리나라 만세\n";
      String str3 = "무궁화 삼천리 화려강산\n";
      String str4 = "대한 사람 대한으로 길이 보전하세";
      
      out.write(str1.getBytes());
      out.write(str2.getBytes());
      out.write(str3.getBytes());
      out.write(str4.getBytes());
      long end = System.nanoTime();
      out.close();
      
      System.out.println(file.length() + "바이트 크기의 " + file.getPath() + " 파일이 생성되었습니다.");
      System.out.println((end-start) + "ns 소요됨");
      
    } catch (Exception e) {
      e.printStackTrace();
    }
    
  }

  
}
