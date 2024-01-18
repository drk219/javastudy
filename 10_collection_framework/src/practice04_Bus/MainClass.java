package practice04_Bus;

public class MainClass {

  public static void main(String[] args) {
    
    try {
      Bus bus= new Bus();
      
      bus.on(new Woman("Ariel"));
      bus.on(new Woman("Jasmine"));
      bus.on(new Woman("Bell"));
      bus.on(new Woman("Mulan"));
      bus.on(new Woman("Cinderella"));
      bus.on(new Woman("Moana"));
      bus.on(new Woman("Elsa"));
      
      bus.list();
      System.out.println();
      
      bus.off(1);
      bus.off(2);
      bus.off(3);

      
      bus.on(new Man("Aladin"));
      bus.on(new Man("James"));
      bus.on(new Man("Hans"));
      bus.on(new Man("Eric"));
      bus.on(new Man("Christophe"));
      bus.on(new Man("Charming"));
      bus.on(new Man("Beast"));
      
      bus.list();
      System.out.println();
      
    } catch (Exception e) {
      
      System.out.println(e.getMessage()); 
    }

  }

}
