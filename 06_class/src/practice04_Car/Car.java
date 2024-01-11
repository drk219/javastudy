package practice04_Car;

public class Car {
  
  // field
  private Driver driver;
  private int currSpeed;
  private int fuel;
  public final static int MAX_SPEED = 100;
  
  // constructor
  public Car() {
    // TODO Auto-generated constructor stub
  }

  public Car(Driver driver, int currSpeed, int fuel) {
    super();
    this.driver = driver;
    this.currSpeed = currSpeed;
    this.fuel = fuel;
  }

  // method
  public Driver getDriver() {
    return driver;
  }

  public void setDriver(Driver driver) {
    this.driver = driver;
  }

  public int getCurrSpeed() {
    return currSpeed;
  }

  public void setCurrSpeed(int currSpeed) {
    this.currSpeed = currSpeed;
  }

  public int getFuel() {
    return fuel;
  }

  public void setFuel(int fuel) {
    this.fuel = fuel;
  }
  
  // 시동걸기
  public void enginStart() {
    if(driver == null || fuel == 0) {
      System.out.println("시동 실패");
    } else {
      System.out.println("시동 성공");
    }
  }
  
  // 1초당 n씩 속도가 증가하는 accelerator (bestDriver는 10씩 늘리고, 아니면 5씩 늘려라)
  // 1초당 1씩 연료가 줄어드는 accelerator
  public void accelerator(int pushTime) {
    
    if(currSpeed == MAX_SPEED ) {
      System.out.println("이미 최고 시속입니다.");
      return;
    }
    if(fuel == 0) {
      System.out.println("연료가 없습니다.");
      return;
    }
    if(pushTime < 0) {
      System.out.println("악셀을 밟아주세요.");
      return;
    }
    

    int n = driver.isBestDriver() ? 10 : 5;        // 베스트드라이버 결과가 ? true 면 10씩 : false 면 5씩
    currSpeed += (pushTime * n);                   // 악셀을 밟는 횟수마다 n 씩 증가
    currSpeed = Math.min(currSpeed, MAX_SPEED);
    
    
    fuel -= pushTime;
    fuel = Math.max(fuel, 0);                     // fuel 이랑 0중에 더 큰 값을 리턴
    
    System.out.println("현재 연료량 : "+ fuel + ", 현재 속도 : " + currSpeed);

  } 
  
  
  // 1초당 10씩 줄어드는 brake
  public void brake(int pushTime) {
    
    if(currSpeed == 0) {                            // 속도가 0이면 
      System.out.println("이미 멈춰있습니다.");
      return;
    }
    if(pushTime <= 0) {                             // 브레이크를 밟지 않으면
      System.out.println("브레이크를 밟아주세요.");
      return;
    }
    
    currSpeed -= (pushTime * 10);
    currSpeed = Math.max(currSpeed, 0);            // currSpeed랑 0중에 더 큰 값을 리턴
    
    System.out.println("현재 연료량 : "+ fuel + ", 현재 속도 : " + currSpeed);
    
  }
  


}
