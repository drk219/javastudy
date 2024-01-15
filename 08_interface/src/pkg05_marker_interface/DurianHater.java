package pkg05_marker_interface;

public class DurianHater {
  
  public void eat(Eatable eatable) {
   ((Food)eatable).eat();
  
  }

}
