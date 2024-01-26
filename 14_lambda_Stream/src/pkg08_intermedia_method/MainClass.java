package pkg08_intermedia_method;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainClass {
  
  public static void method1() {
    
    // filter() 메소드
    // Stream<T> filter(Predicate<T> predicate) {  }
    // predicate 조건에 만족하는 것만 stream 에 반환한다.
    
    // List
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    list.stream()                                          // List 를 stream 으로 변환
       .filter( (number) -> number % 2 == 0 )              // 1~10 까지 숫자를 하나씩 입력해서 짝홀 검사해서 나머지가 0인 숫자 필터링
       .forEach( (number) -> System.out.println(number) ); // true 인 숫자만 출력해라

  }
  
  public static void method2() {
    
    List<Book> books = Arrays.asList(
        new Book("a", "aa", 20000),
        new Book("b", "bb", 8000),
        new Book("c", "cc", 5000),
        new Book("d", "dd", 15000),
        new Book("e", "ee", 25000)
        );
    
    books.stream()
       .filter( (book) -> book.getPrice() >= 10000 )
       .forEach( (book) -> System.out.println(book.getTitle()) );
    
    List<Book> over20000 = books.stream()
       .filter( (book) -> book.getPrice() >= 20000 )
       .collect(Collectors.toList());
    System.out.println(over20000);
    
  }
  
  public static void method3() {
    
    // map() 메소드 : 값을 바꿀 때 사용
    // Stream<T> map(Function<T, R> function) { }
    
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    
    list.stream()
//      .filter(null)                    // filter 를 사용하려면 map 앞에서 사용하도록
        .map( (number) -> number + 1)    // number 를 주면 1만큼 키워서 반환해줘 (2~11 반환)
        .forEach( (number) -> System.out.println(number) );
    
  }
  
  public static void method4() {
    
    // 20000원 이상의 책 가격을 50% 세일한 리스트 생성하기
    List<Book> books = Arrays.asList(
        new Book("a", "aa", 20000),
        new Book("b", "bb", 8000),
        new Book("c", "cc", 5000),
        new Book("d", "dd", 15000),
        new Book("e", "ee", 25000)
        );

    
    List<Book> saleBook = books.stream()   // 20000원 이상의 책들을 가져와서 50%할인시켜라
        .filter( (book) -> book.getPrice() >= 20000 )
        .map( (book) -> new Book(book.getTitle(), book.getAuthor(), book.getPrice() / 2) )
        .toList();
    
    saleBook.stream()   // 세일된 책들의 stream
        .forEach( (book) -> System.out.println(book.getTitle() + ": " + book.getPrice()) );

  }

  
  public static void main(String[] args) {
    method1();
    method2();
    method3();
    method4();
  }

}
