package pkg02_generic_type;

public class MainClass {
  
  public static void main(String[] args) {
    
    // Integer 저장용 Container
    Container<Integer> container1 = new Container<Integer>();
    container1.setItem(10);
    System.out.println(container1.getItem());
    
    // String 저장용 Container
    Container<String> container2 = new Container<>();    // 앞에 타입을 입력해놓으면 뒤에는 생략 가능
    container2.setItem("hello");
    System.out.println(container2.getItem());

  }

}
