package practice05_Bakery;

public class Bakery {
  
  public final static int PRICE = 500;  // 빵가격
  private int count;  // 빵개수
  private int money;  // 돈
  
  
  public Bakery() {
    // TODO Auto-generated constructor stub
  }

  public Bakery(int count, int money) {
    super();
    this.count = count;
    this.money = money;
  }


  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  public int getMoney() {
    return money;
  }

  public void setMoney(int money) {
    this.money = money;
  }
  
  
  // 판매
  // 전달 받는 인자 : 돈, 구매할 빵개수
  // 되돌려 줄 반환 : 잔돈, 구매한 빵개수  => BreadChange 로 객체화
  
  public BreadChange sell(int money, int count) {
    
    // 판매할 빵이 없다.
    if (this.count < count) {
      System.out.println("빵이 부족합니다.");
      return null;
    }
    
    // 잔돈이 없다.
    if (this.money < money - (count * PRICE)) {
      System.out.println("잔돈이 부족합니다.");
      return null;
    }
    
    // 고객이 낸 돈이 부족하다.
    if(count * PRICE > money ) {
      System.out.println("돈이 부족합니다.");
      return null;
    }
    
    
    // 판매처리
    this.money += count * PRICE;
    this.count -= count;
    
    // 반환
    return new BreadChange(count, money - count * PRICE);
    
  }
  

}
