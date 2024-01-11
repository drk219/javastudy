package practice03_Member;

public class Member {
  
  // field
  private String id;
  private Contact contact;
  private Address address;
  
  // constructor
  public Member() {
    // TODO Auto-generated constructor stub
  }

  public Member(String id, Contact contact, Address address) {
    this.id = id;
    this.contact = contact;
    this.address = address;
  }

  // method
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Contact getContact() {
    return contact;
  }

  public void setContact(Contact contact) {
    this.contact = contact;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  
//  public void setContact(String i, String j) {
//    System.out.println("유선번호 : " + i);
//    System.out.println("휴대전화 : " + j);
//  }
//
//
//  public void setAddress(String post, String road, String jibun, String detail, String extra, String basic ) {
//    System.out.println(post + " " + road + jibun + " " + detail + extra);
//  }

  
}
