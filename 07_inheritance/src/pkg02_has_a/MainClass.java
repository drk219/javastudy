package pkg02_has_a;

public class MainClass {

  public static void main(String[] args) {
    
    Soldier soldier = new Soldier();
    
    for(int n = 0; n < 15; n++) {
      
      soldier.shoot();
    }
    
    soldier.reload(20);

  }

}
