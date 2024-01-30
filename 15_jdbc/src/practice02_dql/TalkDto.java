package practice02_dql;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class TalkDto {
  
  /*
   * TALK_T 테이블의 데이터를 TANK_NO의 내림차순으로 정렬한 뒤 11~20번째 행을 조회하여 List 에 저장하시오.
   * TALK_T 구조
   *    TALK_NO      NUMBER (PK)
   *    TALK_CONTENT VARCHAR2(1000 BYTE)
   *    TALK_USER    VARCHAR2(1000 BYTE)
   *    WRITTEN_AT   TIMESTAMP (* 현재 날짜/시간 : CURRENT_TIMESTAMP)
   * DB 서버 환경
   *    192.168.0.214
   *    GD/1111
   */
  
  
  private int talk_no;
  private String talk_content;
  private String talk_user;
  private Timestamp written_at;

}
