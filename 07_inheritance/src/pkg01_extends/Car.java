package pkg01_extends;

public class Car {
  
  
  //private String model;
  // 'private' 처리된 필드는 서브에서 사용할 수 없다.
  protected String maker;  
  // 'protected' 처리된 필드는 서브에서 접근할 수 있다.
  
  
  public void forward() {
    System.out.println("앞으로");
  }

  public void reverse() {
    System.out.println("뒤로");
  }
  
  public void stop() {
    System.out.println("정지");
  }
  
  
}
