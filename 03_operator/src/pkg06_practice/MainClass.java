package pkg06_practice;

public class MainClass {
  
  
      public static void method1() 
      {   
        
        int second = 230;
        int m = second / 60; // 1  분
        int s = second % 60; // 30 초
    
        System.out.println(m + "분");
        System.out.println(s + "초");
        
      }
      
      
      public static void method2() 
      {
        
        // x 와 y 의 값을 교환하기
        
        int x = 10;
        int y = 20;
        int temp;
        temp = x;
        x = y;
        y = temp;
        
        System.out.println(x);  // 20
        System.out.println(y);  // 10
        
      }
      
      
      public static void method3() 
      {
        
        // 점수가 90점대이면 true 아니면 false
        int score = 98;
        System.out.println(score >= 90); 
      
        boolean result1 = score >=90 && score < 100;
        System.out.println(result1); 
        
        boolean result2 = (score / 10) == 9;
        System.out.println(result2);
    
      }
    
      
      public static void method4() 
      {
        
        // 짝수 홀수 판단
        // 짝수 : 2로 나눈 나머지가 0
        // 홀수 : 2로 나눈 나머지가 1
        
        int n = 8;
        String result = n % 2 == 0 ? "짝수" : "홀수";
        System.out.println(result);
    
      }
    
        
      
      public static void main(String[] args) 
      {
        method1();
        method2();
        method3();
        method4();
      }

}
