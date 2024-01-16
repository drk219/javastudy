package practice03_BankAccount;

public class BankException extends Exception {
  
  // field
  int errorCode;
  
  // constructor
  public BankException(int errorCode) {
    super();
    this.errorCode = errorCode;
  }
  
  public BankException(String message, int errorCode) {
    super(message);
    this.errorCode = errorCode;
  }
  
  // method
  public int getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(int errorCode) {
    this.errorCode = errorCode;
  }

}
