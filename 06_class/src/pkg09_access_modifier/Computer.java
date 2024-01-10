package pkg09_access_modifier;

/*
 * Getter
 * 1. 클래스의 필드값을 외부로 반환하는 메소드
 * 2. 'get + 필드명'으로 메소드이름을 결정 (boolean 타입은 'is + 필드명')
 */

/*
 * Setter
 * 1. 외부로부터 전달된 값을 필드에 저장하는 메소드
 * 2. 'set + 필드명'으로 메소드이름을 결정
 */

public class Computer {
  
  
  // field 
  private String model;   //초기값 null , 0
  private int price;
  private Calculator calculator;
  
  
  public Computer(String model, int price, Calculator calculator) {
    this.model = model;
    this.price = price;
    this.calculator = calculator;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public Calculator getCalculator() {
    return calculator;
  }

  public void setCalculator(Calculator calculator) {
    this.calculator = calculator;
  }
  
  

}
