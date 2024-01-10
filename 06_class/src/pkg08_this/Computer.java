package pkg08_this;

public class Computer {
  
  String model;
  int price;
  
  // this() : 생성자를 호출하는 것
  // this.멤버 : 멤버(필드, 메소드)를 호출하는 것 **
  
  Computer(){                             // new Computer()
    this(null, 0);                       
  }
  
  Computer(String model){                // new Computer("gram")
    this(model, 0);
  }
  
  Computer(String model, int price){     // new Computer("gram", 0)
    this.model = model;                  // _로 구분하던거를 this.을 이용해서 멤버 호출 가능
    this.price = price;
  }
  
  
  void showThis() {
    System.out.println(this);   // this : 현재 객체(showThis() 메소드를 호출한 객체)를 의미
  }
  
  void showModel() {
    System.out.println(this.model);
  }
  
  /*
   * 이 Computer 클래스 안에서는 this 가 객체
   * Computer 클래스 안에서 부르는 건 this.으로 쓴다
   * 다른 클래스(외부)에서는 이름을 정해서 부른다
   * ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
   * <챗 gpt>
   * this 는 자바에서 현재 사용 중인 객체를 가리키는 특별한 단어야. 
   * 클래스 안에서 쓰이는데, 그 객체 자기 자신을 가리켜.
   * 이걸 쓰면 변수 이름이나 메소드 이름이 객체의 것인지 혼동되지 않아.
   * 객체 안에서 그 객체를 가르키는 거라고 생각하면 돼!
   */

}
