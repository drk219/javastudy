package practice07_Fighter;


public class Fighter {
  
  private String name;
  private int hp;
  private int power;
  
  
  public Fighter() {
  
  }


  public Fighter(String name, int hp, int power) {
    super();
    this.name = name;
    this.hp = hp;
    this.power = power;
  }
  


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getHp() {
    return hp;
  }

  public void setHp(int hp) {
    this.hp = hp;
  }
  
  public int getPower() {
    return power;
  }

  public void setPower(int power) {
    this.power = power;
  }



  // isALive
  public boolean isAlive(){
    return hp > 0;
  }
  
  // punch 
  public void punch(Fighter p2) {
    
    System.out.println("- " + name + "의 펀치");
    
    int powerRan = (int) (Math.random() * 10 + 1); // 1 <= powerRan < 11  (1 ~ 10)
    
    if(powerRan >= p2.getHp()) {
      p2.setHp(0);
     } else {
       p2.setHp(p2.getHp() - powerRan);
      }
    System.out.println("(" + name + " HP:" + hp + "/ " + p2.getName() + " HP:" + p2.getHp() + ")\n");
  }
    
}
