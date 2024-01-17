package practice03_Club;

public class MainClass {

  public static void main(String[] args) {
    
    Club club = new Club();
    
    Person p1 = new Person ("1");
    Person p2 = new Person ("2");
    Person p3 = new Person ("3");
    Person p4 = new Person ("4");
    Person p5 = new Person ("5");
    
    club.enterClub(p1);
    club.enterClub(p2);
    club.enterClub(p3);
    club.enterClub(p3);
    club.enterClub(p3);
    club.enterClub(p4);
    club.enterClub(p5);
    club.enterClub(new Person("6"));  // String id 를 이용해서 검사한게 아니라 참조값으로 검사한거라서
    club.enterClub(new Person("6"));  // new 로 생성하게 되면 2개가 참조값이 달라서 중복으로 출력이 가능해짐

    club.leaveClub(p1);
    
    club.poolList();

  }

}
