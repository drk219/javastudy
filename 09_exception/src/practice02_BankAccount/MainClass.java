package practice02_BankAccount;

public class MainClass {

  public static void main(String[] args) {
    
    // 생성자
    BankAccount account1 = new BankAccount();
    
    // Setter
    account1.setAccNo("01012345678");
    account1.setBalance(100000);
        
    // 생성자2
    BankAccount account2 = new BankAccount("01012345678", 50000);
    
    
    //////////
    
    try {
      account1.deposit(100000);  // 10만원 입금(성공)
      account1.deposit(-50000);  // -5만원 입금(실패)
      
      
      long money;
      money = account1.withdrawal(100000);  // 10만원 출금 (성공)
      System.out.println(money);            // 출금된 금액 출력
      money = account1.withdrawal(200000);  // 20만원 출금 (실패)
      System.out.println(money);            // 0 (출금된 금액 출력)
      
      
      account1.transfer(account2, 50000);    // account1 -> account2, 50000원 이체 (성공)
      account1.transfer(account2, 100000);   // account1 -> account2, 100000원 이체 (실패)
      
    } catch (Exception e) {
      
      System.out.println(e.getMessage());
    }

    /*
     * account1.deposit(-50000); 에서 예외 상황이 발생하기 때문에
     * 런타임은 거기서 즉시 스탑!
     */
    
  }

}
