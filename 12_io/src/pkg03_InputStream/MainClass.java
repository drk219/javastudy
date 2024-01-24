package pkg03_InputStream;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import pkg02_OutputStream.Employee;   // 표준 api가 아니기 때문에 줄바꿈으로 분리되어서 생성된다.

public class MainClass {
  
  /*
   * < java.io.FileInputStream >
   * 1. 바이트 기반의 파일 입력 스트림이다.
   * 2. 입력 단위
   *    1) int
   *    2) byte[]
   */
  
  /*
   * < java.io.BufferedInputStream >
   * 1. 버퍼링을 지원하는 바이트 입력 스트림이다.
   * 2. 보조 스트림이므로 메인 스트림과 함께 사용해야 한다. (단독 사용 불가)
   * 3. 버퍼링을 지원하므로 입력 속도가 향상된다.
   */
  
  /*
   * < java.io.DataInputStream >
   * 1. 자바 변수로 구성된 데이터를 읽는 바이트 입력 스트림이다.
   * 2. 보조 스트림이므로 메인 스트림과 함께 사용해야 한다.
   * 3. 타입 별로 전용 메소드가 존재한다.
   */
  
  /*
   * < java.io.ObjectInputStream >
   * 1. 객체로 구성된 데이터를 읽는 바이트 입력 스트림이다.
   * 2. 보조 스트림이므로 메인 스트림과 함께 사용해야 한다.
   * 3. 읽는 객체는 Object 타입으로 반환되므로 객체 타임으로 캐스팅해서 사용한다.
   *    -> IOException, ClassNotFoundException 예외가 발생할 수 있다.
   */

  
  public static void method1() {  //파일 입력 스트림 int
    
    File dir = new File("\\storage");
    File file = new File(dir, "sample1.dat");
    
    // 파일 입력 스트림 선언
    FileInputStream in = null;
    
    try {
      
      // 파일 입력 스트림 생성
      in = new FileInputStream(file);  // FileNotFoundException 예외 발생(폴더가 없는 경우)
      
      // 읽을 단위 (int 변수로 1바이트씩 읽는다.)
      int c; 

      // 읽은 데이터를 보관할 배열
      byte[] b = new byte[(int)file.length()];  // file 파일은 long 타입이기 때문에 int 로 변환해줘야한다
      int idx = 0;
      
      // 읽기
      while(true) {
        c = in.read();
        if(c == -1) {
          break;
        }
        b[idx++] = (byte)c;
      }
      for(int i = 0; i < b.length; i++)
        
        //확인
        System.out.println(b[i]);
      
      // 닫기
      in.close();

    } catch (FileNotFoundException e) {
      System.out.println("파일의 경로를 확인하세요.");
      }
      catch (IOException e) {
      System.out.println("입출력 예외 발생");
      }
    
  }
  
  public static void method2() {  //파일 입력 스트림 bytes[]
    
    File dir = new File("\\storage");
    File file = new File(dir, "sample2.dat");
    
    FileInputStream in = null;
    
    try {
      
      // 파일 입력 스트림 생성
      in = new FileInputStream(file);
      
      // 읽은 데이터를 보관할 배열
      byte[] b = new byte[(int)file.length()];
      
      // 읽을 단위 (byte[] 배열로 읽는다.)
      byte[] bytes = new byte[5];
      int idx = 0;
      
      // 읽기
      while(true) {
        int readByte = in.read(bytes);
        if(readByte == -1) {
          break;
        }
        System.arraycopy(bytes, 0, b, idx, readByte);
        idx += bytes.length;                           // idx += readByte
      }
      
      // 확인
      System.out.println(new String(b));
    
      // 닫기
      in.close();
      
    } catch (FileNotFoundException e) {
      System.out.println(file.getPath() + "파일이 존재하지 않습니다.");  //파일이 존재하지 않을 때 발생하는 예외를 처리
    } catch (IOException e) {
      System.out.println("입출력 예외 발생");  //입출력 오류가 발생했을 때의 예외를 처리
    }
    
  }
  
  public static void method3() {  //BufferedInputStream
    
    File dir = new File("\\storage");
    File file = new File(dir, "sample3.dat");
    
    BufferedInputStream in = null;
    
    try {
      
      in = new BufferedInputStream(new FileInputStream(file));
      
      byte[] b = new byte[(int)file.length()];
      
      byte[] bytes = new byte[5];
      int idx = 0;
      
      int readByte = 0;
      while(   (readByte = in.read(bytes)) != -1   ) {    // -1이 아니면 계속 반복해라
         System.arraycopy(bytes, 0, b, idx, readByte);
         idx += bytes.length;
        }
      
      System.out.println(new String(b));
      
      in.close();
            
    } catch (IOException e) {
      e.printStackTrace();
    } 
    
  }
  
  public static void method4() {  //DataInputStream
    
    File dir = new File("\\storage");
    File file = new File(dir, "\\sample4.dat");
    
    DataInputStream in = null;
    
    try {
      
      in = new DataInputStream(new FileInputStream(file));
      
      String name = in.readUTF();          // 출력시 out.writeUTF(name) 사용했기에 같은 인코딩 방식으로 읽는다.
      int age = in.readInt();              // out.writeInt(age)
      double height = in.readDouble();     // out.writeDouble(height)
      boolean isAdult = in.readBoolean();  // out.writeBoolean(isAdult)
      char gender = in.readChar();         // out.writeChar(gender)
      
      System.out.println(name);
      System.out.println(age);
      System.out.println(height);
      System.out.println(isAdult);
      System.out.println(gender);
      
      in.close();
      
    } catch (Exception e) {
      e.printStackTrace();
    }
    
  }
  
  public static void method5() {  //ObjectInputStream
    
    File dir = new File("\\storage");
    File file = new File(dir, "\\sample5.dat");
    
    ObjectInputStream in = null;
    
    try {
      
      in = new ObjectInputStream(new FileInputStream(file));
      
      Employee emp1 = (Employee)in.readObject();  // Employee 와 패키지가 다르므로 import 를 해줘야 한다.
      List<Employee> empList = (List<Employee>)in.readObject();  // List 객체를 데리고 와야한다.

      
      System.out.println(emp1);
      System.out.println(empList.get(0));
      System.out.println(empList.get(1));
      
      in.close();
    
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }
    
  }
  
  public static void main(String[] args) {
    method1();
    method2();
    method3();
    method4();
    method5();

  }

}
