package pkg05_condition;

public class MainClass {

      public static void main(String[] args) 
      {
    
        
          /*
           * 조건 연산
           * 1. 조건식의 결과에 따라 반환되는 값이 다른 연산이다.
           * 2. 형식
           *    expr ? if expr is true : if expr i false
           *    ----   ---------------   --------------
           *    1항           2항              3항
           */
          
           int hour = 11;  //오전
           //int hour = 14;  //오후
           
           String ampm = hour < 12 ? "오전" : "오후";
           System.out.println(ampm);
          
          
          int score = 50;
          String result = score >= 60 ? "합격" : score >= 50 ? "재시험" : "불합격";
          System.out.println(result);
      }
    
    
    
    
  }