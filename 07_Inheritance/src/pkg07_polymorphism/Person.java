package pkg07_polymorphism;

public class Person {
  
  public void powerOn(Elec elec) {    //Elec elec은 = new Tv(), Elec elec = new Radio()
    
    /*
     * 1. 다운캐스팅으로 powerOn() 호출하기 -> 코드의 추가가 필요하므로 추천하지 않는다.
     * 
     * if(elec instanceof Tv) {
     *  ((Tv)elec).powerOn();
     * } 
     * else if(elec instanceof Radio){
     *  ((Radio)elec).powerOn();
     * }
    */
    
    /*
     * 2. Elec 에 powerOn() 매소드를 추가하고 TV 나 Radio 가 오버라이드 하기
     */
    elec.powerOn();
  
  }

}
