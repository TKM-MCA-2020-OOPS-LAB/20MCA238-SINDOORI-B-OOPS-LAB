package myproject;
import java.io.File;

class filelist {
  public static void main(String[] args) {

    File file = new File("C:\\Users\\Sindhoori");
    String[] fileList = file.list();

    for(String str : fileList) {
      System.out.println(str);
    }
  }
}