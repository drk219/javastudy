package pkg04_logical;

public class MainClass {

  public static void main(String[] args) {

    /*
     * 논리 연산
     * 1. boolean 타입의 값을 이용한 연산이다.
     * 2. 종류
     *    1) && : 논리 AND, 두 항이 모두 TRUE이면 나머지는 FALSE 반환
     *    2) || : 논리 OR, 두 항 중 하나라도 TRUE이면 TRUE 나머지 경우는 FALSE 반환
     *    3) ! : 논리 NOT, 전달된 항이 TRUE이면 FALSE 반환 (반대 값을 반환)
     *    
     */
    
    /*
     * 숏 서킷
     * 1. 연산 결과의 빠른 처리를 위한 동작이다.
     * 2. 종류 
     *    1) && : false 가 반환되면 최종 결과도 false 이므로 더 이상 동작하지 않는다.
     *    2) || : true 가 반환되면 최종 결과도 true 이므로 더 이상 동작하지 않는다.
     */
    
    int n1 = 10;
    int n2 = 20;
    
    boolean a = n1 == 10 && n2 == 20; 
    boolean b = n1 == 10 && n2 == 10;
    boolean c = n1 == 20 && ++n2 == 20;  // 숏서킷에 의해 n1==10에서 이미 false 가 떠서 ++n2가 실행 안함.
    System.out.println(n2);
    boolean d = n1 == 20 && n2++ == 20;  // 숏서킷에 의해 n1==10에서 이미 false 가 떠서 n2++가 실행 안함.
    
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    
    
    boolean f = n1 == 10 || n2++ == 20;  // 숏서킷에 의해 n1==10에서 이미 true 가 떠서 n2++==20가 실행 안함.
    boolean g = n1 == 10 || ++n2 == 10;    // 숏서킷에 의해 n1==10에서 이미 true 가 떠서 ++n2==10가 실행 안함.
    System.out.println(f);
    System.out.println(g);
    
    
    boolean h = !(n1 == 10);
    System.out.println(h);
    
  }

}
