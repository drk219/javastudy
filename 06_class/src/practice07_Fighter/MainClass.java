package practice07_Fighter;

public class MainClass {

  public static void main(String[] args) {
    
    // fighter
    Fighter fighter1 = new Fighter();
    fighter1.setName("거북이");
    fighter1.setHp(30);

    Fighter fighter2 = new Fighter();
    fighter2.setName("토끼");
    fighter2.setHp(30);
    
    
    

    // turn
    boolean p1 = true;
    
    
    // keep fight
    while(fighter1.isAlive() && fighter2.isAlive()) {
      
      if(p1) {
        fighter1.punch(fighter2);
      } else {
        fighter2.punch(fighter1);
      }
      
      p1 = !p1;
      
    }
    
    if (fighter1.isAlive()) {
      System.out.println(fighter1.getName() + "님의 KO승");
    } else {
      System.out.println(fighter2.getName() + "님의 KO승");
    }
    

  }

}
