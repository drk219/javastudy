package pkg09_access_modifier;

public class MainClass {

  public static void main(String[] args) {
    
    // computer 객체 선언 및 생성
    Computer computer = new Computer("galaxybook", 400, new Calculator());
    
    //System.out.println(computer.model);  // field 를 프라이빗으로 설정해서 직접 접근 불가
    //computer.develop();  // public 한 메소드를 통해서 간접 접근은 가능
    
    
    // 필드로 값을 전달하는 메소드 
    computer.setModel("gram");
    computer.setPrice(200);
    computer.setCalculator(new Calculator());
    
    
    // 필드값을 가져오는 메소드 getter
    System.out.println(computer.getModel());
    System.out.println(computer.getPrice());
    //System.out.println(computer.getCalculator());
    computer.getCalculator().add();
    computer.getCalculator().add(1);
    computer.getCalculator().add(2, 3);
    computer.getCalculator().add(4, 5, 6);

  }

}
