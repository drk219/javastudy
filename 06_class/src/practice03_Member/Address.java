package practice03_Member;

public class Address {       // vo dto bean
  
  // field  (field 에 새로운 내용이 추가되면 컨스럭터를 지우고 다시 생성하는거 추천)
  // 필드명 만들때 'aNumber'처럼 소문자 한글자만 쓰는 일은 피하도록!! getter 생성할 때 문제생김 
  private String postCode;
  private String roadAddress;
  private String jibunAddress;
  private String detailAddress;
  private String extraAddress;
  private boolean basicAddress;
  
  // constructor
  public Address() {
    // TODO Auto-generated constructor stub
  }
  
  public Address(String postCode, String roadAddress, String jibunAddress, String detailAddress, String extraAddress,
      boolean basicAddress) {
    super();
    this.postCode = postCode;
    this.roadAddress = roadAddress;
    this.jibunAddress = jibunAddress;
    this.detailAddress = detailAddress;
    this.extraAddress = extraAddress;
    this.basicAddress = basicAddress;
  }


  // method (getter setter)
  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  public String getRoadAddress() {
    return roadAddress;
  }

  public void setRoadAddress(String roadAddress) {
    this.roadAddress = roadAddress;
  }

  public String getJibunAddress() {
    return jibunAddress;
  }

  public void setJibunAddress(String jibunAddress) {
    this.jibunAddress = jibunAddress;
  }

  public String getDetailAddress() {
    return detailAddress;
  }

  public void setDetailAddress(String detailAddress) {
    this.detailAddress = detailAddress;
  }

  public String getExtraAddress() {
    return extraAddress;
  }

  public void setExtraAddress(String extraAddress) {
    this.extraAddress = extraAddress;
  }

  public boolean isBasicAddress() {      // boolean 타입은 get 이 아니라 is 로 시작
    return basicAddress;
  }

  public void setBasicAddress(boolean basicAddress) {
    this.basicAddress = basicAddress;
  }
  
  

}
