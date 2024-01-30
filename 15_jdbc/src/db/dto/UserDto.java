package db.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
 * DAO
 * 1. Database Access Object
 * 2. 데이터베이스에 접근해서 쿼리문을 실행하고 쿼리문의 실행 결과를 받는 객체이다.
 * 3. 하나의 객체만 만들어서 사용하는 Singleton Pattern 으로 DAO 객체를 생성한다.
 */

/*
 * Singleton Pattern
 * 1. 오직 하나의 객체만 만들어서 사용하는 패턴이다.
 * 2. 클래스 내부에서 객체를 미리 만든 뒤 해당 객체를 가져다 사용할 수 있도록 메소드를 제공한다.
 * 3. 클래스 외부에서 객체를 생성할 수 없도록 생성자를 private 처리한다.
 */

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserDto {
  
  private int user_no;
  private String user_name;
  private String user_tel;
  private String join_dt;

}
