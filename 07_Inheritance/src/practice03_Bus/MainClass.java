package practice03_Bus;

public class MainClass {

  public static void main(String[] args) {
    
    Bus bus= new Bus();
    
    bus.on(new Woman("Ariel"));
    bus.on(new Woman("Jasmine"));
    bus.on(new Woman("Bell"));
    bus.on(new Woman("Mulan"));
    bus.on(new Woman("Cinderella"));
    bus.on(new Woman("Moana"));
    
    bus.list();
    
    bus.off(1);
    bus.off(2);
    bus.off(3);
    bus.off(4);
    bus.off(5);
    
    bus.on(new Man("Aladin"));
    bus.on(new Man("James"));
    bus.on(new Man("Hans"));
    bus.on(new Man("Eric"));
    bus.on(new Man("Christoph"));
    bus.on(new Man("Charming"));
    
    bus.list();

  }

}
