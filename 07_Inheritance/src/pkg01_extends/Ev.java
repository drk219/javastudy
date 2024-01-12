package pkg01_extends;


// class 자식 extends 부모{ }
// class 서브 extends 슈퍼{ }
public class Ev extends Car {
  
  
  public void charge() {
    //System.out.println(model);    // 접근 불가로 오류가 뜬다. (private)
    System.out.println(maker);      // 접근 가능 (protected)
    System.out.println("충전");
  }


}
