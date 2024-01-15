package pkg05_marker_interface;

public class MainClass {

  public static void main(String[] args) {
    
    Person person = new Person();
    person.eat(new Applemango());
    person.eat(new Pineapple());
    person.eat(new Durian());

    DurianHater durianHater = new DurianHater();
    durianHater.eat(new Applemango());
    durianHater.eat(new Pineapple());
    // durianHater.eat(new Durian());  // 컴파일 오류
    
  }

}
