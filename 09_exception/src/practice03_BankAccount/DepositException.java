package practice03_BankAccount;

public class DepositException extends BankException{

  public DepositException(String message, int errorCode) {
    super(message, errorCode);
  }
  
  public DepositException(int errorCode) {
    super(errorCode);
  }
  
}
