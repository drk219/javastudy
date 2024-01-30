package pkg03_dql;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
 * DTO
 * 1. Data Transfer Object
 * 2. 데이터베이스의 데이터를 자바와 주고 받을 때 사용하는 객체이다.
 * 3. 기본적으로 테이블 하나당 DTO 하나를 만든다.
 * 4. 필드는 칼럼에 매칭하고 생성자와 getter/setter 를 만든다.
 */

@ToString            // toString()
@NoArgsConstructor   // default constructor
@AllArgsConstructor  // constructor using field
@Getter
@Setter

public class SampleDto {
  
  // field
  // lombok 이라고 하는 라이브러리에 맡겨서 생성자와 게터세터를 완성한다.
  // lombok 파일 설치 -> cmd -> cd C:\GDJ77\jar -> java -jar lombok.jar
  // lombok 설치후 이클립스가 안열리면 eclipse.ini 들어가서 -javaagent:C:\GDJ77\tools\eclipse\lombok.jar 지우고 저장하고 
  // 이클립스 파일안에 롬복.자르 파일 삭제하고 이클립스 다시 열면 된다. 단, 롬복을 다시 설치해야함!!

  private int sample_no;
  private String sample_content;
  private String sample_editor;
  private Date sample_dt;
  

}
