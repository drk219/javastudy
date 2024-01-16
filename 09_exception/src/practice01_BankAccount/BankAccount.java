package practice01_BankAccount;

public class BankAccount {
  
  // field
  private String accNo;
  private long balance;
  
  // constructor
  public BankAccount() {
  }
  
  public BankAccount(String accNo, long balance) {
    this.accNo = accNo;
    this.balance = balance;
  }

  // method
  public String getAccNo() {
    return accNo;
  }


  public void setAccNo(String accNo) {
    this.accNo = accNo;
  }


  public long getBalance() {
    return balance;
  }


  public void setBalance(long balance) {
    this.balance = balance;
  }

  
  ////////////
  // 1. 메소드마다 try catch 
  // 2. 메소드 호출한 곳으로 예외던지기
  
  // deposit 예외처리하기
  public void deposit(long money) {
    
    try {

      if (money <= 0) {
        throw new RuntimeException(money + "원 입금 불가");
      }
      
      balance += money;
      
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    
  }
    
    
  // withdrawal 예외처리하기
  public long withdrawal(long money) {
    
    long retValue = 0L;
    
    try {
      
      if (money <= 0) {
        throw new RuntimeException(money + "원 출금 불가");
      }
      
      if (money > balance) {
        throw new RuntimeException("잔액 부족");
      }
      
      balance -= money;
      retValue =  money;
      
    } catch (Exception e){
      System.out.println(e.getMessage());
    }
    
    return retValue;
    
  }
  
  
  // transfer 예외처리 해야 할까?
  public void transfer(BankAccount account, long money) {
    
    // 내 통장에서 출금 -> 출금된 금액이 반환 -> 네 통장에 입금
    
    // 내 통장에서 출금
    // long a = withdrawal(money);
    
    // 네 통장 입금
    // account.deposit(a);
    
    account.deposit(withdrawal(money));
    // 입금과 출금이 알아서 예외 처리를 하기 때문에 할 필요가 없다!
  }

}
