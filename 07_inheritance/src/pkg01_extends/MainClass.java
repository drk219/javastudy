package pkg01_extends;

public class MainClass {

  public static void main(String[] args) {
    
    Ev ev = new Ev();
    ev.charge();
    ev.forward();
    ev.reverse();
    ev.stop();
    // 서브(자식)인 Ev 는 본인꺼인 charge 이외에 
    // 슈퍼(부모) Car 의 나머지 3개의 메소드를 모두 쓸 수 있음

  }

}
