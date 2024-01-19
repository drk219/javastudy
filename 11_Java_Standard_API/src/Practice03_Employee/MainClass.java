package Practice03_Employee;

public class MainClass {

  public static void main(String[] args) {
    
    Company company = new Company("SAMSUNG");
    
    new CompanyHandler(company).manage();
    

  }

}
