package pkg03_branch_practice;

public class MainClass 
{
  
  
    
    public static void method1() 
    {
        // 월에 따른 계절 출력하기
      
        // 방법 1 (내답)
          int month = 6;
          
          if (month <= 2 || month == 12)
          {
           System.out.println("겨울");
          } 
          else if (month <= 5) 
          {
           System.out.println("봄");
          } 
          else if (month <= 8)
          {
           System.out.println("여름"); 
          }
          else
          System.out.println("가을");
       
        // 방법 2  
          int m = 10;
          String season;
          
          if (m >= 3 && m <= 5) 
          {
            season = "spring";
          } 
          else if(m >= 6 && m <= 8)
          {
            season = "summer";
          }
          else if (m >= 9 && m <= 11)
          {
            season = "fall";
          }
          else {season = "winter";}
          
          System.out.println(season);
       
        
        // 방법 3
          int month1 = 11;
          String season1;
          int mod = month1 % 12;
         
          if(mod <= 2){
           season1 = "winter";
          } else if(mod <= 5){
           season1 = "spring";
          } else if(mod <= 8){
           season1 = "summer";
          } else {season1 = "fall";}
         
          System.out.println(season1);
           
        
    }
    
    

    public static void method2() 
    {
      
        // 점수와 학년에 따른 합격 여부
        // 1~3학년 : 60점 이상이면 합격, 아니면 불합격
        // 4~6학년 : 70점 이상이면 합격, 아니면 불합격
        
        
        // 방법 1 (내답)
          int score = 64;  // 점수
          int grade = 4;   // 학년
          
          if (grade <= 3 && score >=60 ) 
          {
            System.out.println("합격");
          }
          else if (grade >= 4 && score >= 70) 
          {
            System.out.println("합격");
          }
          else 
          {
            System.out.println("불합격");
          }
        
        // 방법 2 
          
          int pass = 0;
          if(grade >= 1 && grade <= 3){
          pass = 60;}
          else if(grade>= 4 && grade <= 6){
          pass = 70;}
          
         /*
          합격 / 불합격
          String result = null;
          if (score >= pass) {
          result = "합격";}
          else {
          result = "불합격";}
         */
        
    }
    
    
    
    public static void method3() 
    {
      
        // 4일은 목요일, n 일 후는 무슨 요일?
        int day = 4;      // 4일은 목요일
        int nDay = 27;    // nDay일 후
        String weekName;  // 요일 (월~일)
        
        
        // day 의 nDay 후 
        day += nDay;
        
        
        // day 를 7로 나눈 나머지
        int mod = day % 7;
        if (mod == 0) weekName = "일";
        else if (mod == 1) weekName = "월";
        else if (mod == 2) weekName = "화";
        else if (mod == 3) weekName = "수";
        else if (mod == 4) weekName = "목";
        else if (mod == 5) weekName = "금";
        else weekName = "토";
            
        System.out.println(weekName + "요일");

    }
    


    public static void method4() 
        {
        
          String order = "아메리카노";
          int price = 0;

          
          //메뉴에 따른 가격
          // 아메리카노 : 1000
          // 카페라떼 : 2000
          // 밀크티 : 3000
          // 기타 : 5000
        
           switch(order) {
           case "아메리카노":
             price = 1000;
             break;
           case "카페라떼":
             price = 2000;
             break;
           case "밀크티":
             price = 3000;
             break;
           default :
             price = 5000;
           }
           
           System.out.println(price);
           
        }

 
  

  public static void main(String[] args) {
    method1();
    method2();
    method3();
    method4();

  }

}
