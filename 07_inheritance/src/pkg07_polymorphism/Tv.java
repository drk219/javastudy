package pkg07_polymorphism;

public class Tv extends Elec {
  
  @Override
  public void powerOn() {
    System.out.println("TV 전원 버튼을 누른다.");
  }

}
