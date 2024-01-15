package practice03_Bus;

public class Seat {
  
  
  // field
  private Person person;
  
  // constructor
  public Seat() {
  }

  public Seat(Person person) {
    super();
    this.person = person;
  }
  
  // method
  public Person getPerson() {
    return person;
  }

  public void setPerson(Person person) {
    this.person = person;
  }

}
