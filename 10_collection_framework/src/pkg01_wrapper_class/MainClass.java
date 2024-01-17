package pkg01_wrapper_class;

/*
 * 자바의 기본 자료형(Primitive Type) 8개를 클래스화 해뒀는데 이를 Wrapper 클래스라고 함
 * 기본 자료형을 사용하지 못하는 경우 참조 자료형(Reference Type)으로 바꿔서 제공하는 것이 주된 목적임
 * Wrapper 클래스가 필요한 경우
 *  1) 제네릭 타입 (기본 타입 사용 불가)
 *  2) 기본 자료형에는 없는 null 값의 사용이 필요한 경우
 */

public class MainClass {

  public static void main(String[] args) {
    
    // Auto Boxing (기본 타입 값을 Wrapper 타입으로)
    Integer num = 10;
    
    // Auto Unboxing (Wrapper 타입을 기본 값으로)
    int iNum = num;

    System.out.println(iNum);

  }

}
