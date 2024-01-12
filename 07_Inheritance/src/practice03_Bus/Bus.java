package practice03_Bus;

public class Bus {
  
  
  //field
  private Seat[] seats;
  private int total;
  
  //constructor
  public Bus() {
    seats = new Seat[20];
    for(int i = 0; i < seats.length; i++) {
      seats[i] = new Seat();
    }
  }

  // method
  // ON
  public void on(Person person) {
    if ( total >= seats.length) {
      System.out.println("The bus is full.");
      return;
    }
    for(int i = 0; i < seats.length; i++) {
      if (seats[i].getPerson()==null) {
        seats[i].setPerson(person);
        total++;
      }
    }
  }
  
  // OFF
  public void off(int seatNo) {
    if (seatNo <= 0 || seatNo > seats.length) {
      System.out.println("Wrong seat number. Check again please");
      return;
    }
    seats[seatNo -1].setPerson(null);
    total--;
  }
  
  
  // LIST OF PASSENGER
  public void list() {
    System.out.println("===== LIST OF PASSENGERS =====");
    for(int i = 0; i < seats.length; i++) {
      Person person = seats[i].getPerson();
      if (person == null) {
        System.out.println(String.format("%02d", i + 1) + "is unoccupied");
      } else {
        System.out.println("No." + String.format("%02d", i + 1) + " is " + person.getName()+ "'s seat");
      }
    }
  }


}
