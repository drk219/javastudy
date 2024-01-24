package practice01_byte_copy;

public class MainClass {

  public static void main(String[] args) {
    
    //복사
    MyFileUtils.fileCopy("\\Program Files\\Java\\jdk-17\\LICENSE", "\\storage\\LICENSE");
    
    //이동
    MyFileUtils.fileMove("\\storage\\LICENSE", "\\GDJ77\\LICENSE");

  }

}
 