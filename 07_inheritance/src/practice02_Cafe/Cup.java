package practice02_Cafe;

public class Cup {

  private Coffee coffee;
  
  public void fill(Coffee coffee) {
    this.coffee = coffee;       // setter 를 fill 이라고 만듬
  }
  
  public void whoami() {
    coffee.whoami();
  }
  
}
