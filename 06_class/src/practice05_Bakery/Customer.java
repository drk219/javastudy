package practice05_Bakery;

public class Customer {
  
  private int money;
  private int count;
  
  
  public Customer() {
    // TODO Auto-generated constructor stub
  }

  public Customer(int money, int count) {
    super();
    this.money = money;
    this.count = count;
  }

  public int getMoney() {
    return money;
  }

  public void setMoney(int money) {
    this.money = money;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }
  
  
  // 구매하기
  // 인자 : 구매할 가게, 구매할때 낼 돈, 구매할 빵개수
  // 반환 : 없음
  
  public void buy (Bakery bakery, int money, int count) {
    
    // 가진 금액이 부족하다
    if(this.money < money) {
      System.out.println("금액이 부족합니다.");
      return;
    }
    
    // 구매하기 (곧 Bakery 의 판매를 의미한다.)
    BreadChange breadChange = null;
    if(bakery != null) {
      breadChange = bakery.sell(money, count);
    }
    
    // 구매 결과 처리
    if(breadChange != null) {
      count += breadChange.getBread();   // 구매 후 빵 개수의 변화
      money += breadChange.getChange();  // 구매 후 잔돈의 변화
      this.money -= money;               // 구매하고 남은 돈
    }
  
    
  }
  
  
}