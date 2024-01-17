package practice03_Club;

public class Person {
  
  private String id;
  
  public Person() {
    
  }

  public Person(String id) {
    super();
    this.id = id;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "Person [id=" + id + "]";
  }

  
  // 참조값으로 중복 검사하는 오버라이드 생성
  // HashCode & Equals 이용 (데이터의 빠른 조회를 위해서 해시코드를 이용하는 알고리즘)
  // new 로 생성을 하게 되더라도 참조값이 다르다는게 해쉬코드 boolean 타입으로 검사되면서
  // 중복을 제거해준다.
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Person other = (Person) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    return true;
  }

}
