package practice02_Watch;

public class Watch {
  
  
  // 생성자 
  private int hour;
  private int minute;
  private int second;
  

  public Watch(int hour, int minute, int second) {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }
  
  
  // 메소드

  public void addHour(int hour) {
    if (hour <= 0) {
      return;
    }
    this.hour += hour;
    this.hour %= 24;               // 0~23 사이 값을 가지게 된다.
  }
  
  
  public void addMinute(int minute) {
    if(minute <= 0) {
      return;
    }
    this.minute += minute;
    addHour(this.minute / 60);     // this.minute 값이 60분을 넘어가는 몫은 시간을 계산하는 addHour에서 처리하도록 호출
    this.minute %= 60;
  }
  
  
  public void addSecond(int second) {
    if(second <= 0) {
      return;
    }
    this.second += second;
    addMinute(this.second / 60);   // this.second 값이 60초를 넘어가는 몫은 분을 계산하는 addMinute에서 처리하도록 호출
    this.second %= 60;
  }

  
  
  
  /*
      public void addHour(int hour) {
        this.hour = (this.hour + hour) % 24;
    }

    public void addMinute(int minute) {
        int totalMinute = this.hour * 60 + this.minute + minute;
        this.hour = (totalMinute / 60) % 24;
        this.minute = totalMinute % 60;
    }

    public void addSecond(int second) {
        int totalSecond = this.hour * 3600 + this.minute * 60 + this.second + second;
        this.hour = (totalSecond / 3600) % 24;
        this.minute = (totalSecond / 60) % 60;
        this.second = totalSecond % 60;
    }
  
  */

  
  
  public void see() {  
    System.out.println(String.format("%02d:%02d:%02d", this.hour, this.minute, this.second));
  }
  
}
