package practice03_Member;

public class MainClass {

  public static void main(String[] args) {
    
    
    // 임의의 정보를 가지는 멤버 1명을 만들고, 정보 출력
    // 디폴트 형식 생성자 + setter
    // 필드를 이용한 생성자
    Address address = new Address("14329", "성채로", "37", "경기도 광명시", "409동 403호", true);
    Contact contact = new Contact("028970503", "01092625708"); 
    
    Member member = new Member(); 
    member.setId ("Dorong");
    member.setContact (contact);
    member.setAddress (address);
    
    
    // 정보 출력 getter
    System.out.println("아이디 : " + member.getId());
    System.out.println("우편번호 : " + member.getAddress().getPostCode());
    System.out.println("도로명 : " + member.getAddress().getRoadAddress());
    System.out.println("지번 : " + member.getAddress().getJibunAddress());
    System.out.println("상세 : " + member.getAddress().getDetailAddress());
    System.out.println("추가 : " + member.getAddress().getExtraAddress());
    System.out.println("기본 주소 여부 : " + member.getAddress().isBasicAddress());
    System.out.println("유선번호 : " + member.getContact().getTel());
    System.out.println("휴대전화 : " + member.getContact().getMobile());
    
    
  }

}
