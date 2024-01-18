package practice04_Bus;

import java.util.ArrayList;
import java.util.List;

    /*
    1. 시트 배열 어레이리스트로 변경
       Seat[]  ->  List<Seat>
    
    2. 25 -> public static final
    
    3. 예외처리
     */

public class Bus {
  
  //field
  private List<Seat> seats;            
  public static final int LIMIT = 10;
  private int total;
  
  //constructor
  public Bus() {
    seats = new ArrayList<Seat>(LIMIT); 
    
    for(int i = 0; i < LIMIT; i++) {
      seats.add(new Seat());
    }
  }

  // method
  // 승차
  public void on(Person person) throws RuntimeException {
    if (total >= LIMIT) {
      throw new RuntimeException("The bus is full.");
    }
    for(int i = 0; i < seats.size(); i++) {
      Seat seat = seats.get(i);           // Seat seat 은 각 좌석을 의미
      if (seat.getPerson() == null) {     // 시트에 앉은 사람이 없으면 
        seat.setPerson(person);
        total++;
        break;       // <-- 중요!!! 까먹지마
      }
    }
  }
  
  // 하차
  public void off(int seatNo) throws RuntimeException{
    if (seatNo <= 0 || seatNo > LIMIT) {
      throw new RuntimeException("Wrong seat number. Check again please");
    }
    seats.get(seatNo - 1).setPerson(null);
    total--;
  }
  
  
  // LIST OF PASSENGER
  public void list() {
    System.out.println("=== LIST OF PASSENGERS ===");
    for(int i = 0; i < LIMIT; i++) {
      Person person = seats.get(i).getPerson();
      if (person == null) {
        System.out.println("No." + String.format("%02d", i + 1) + " is unoccupied");
      } else {
        System.out.println("No." + String.format("%02d", i + 1) + " is " + person.getName() + "'s seat");
      }
    }
  }


}
