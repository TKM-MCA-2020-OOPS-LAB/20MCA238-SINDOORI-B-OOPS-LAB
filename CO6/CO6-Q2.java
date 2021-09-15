import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class cfile {
	 public static void main(String[] args) {

	  try {
          FileWriter writer = new FileWriter("C:\\Users\\Sindhoori\\Desktop\\java\\sample.txt",true);
          writer.write("A Sample txt file is Created...\n");
          writer.close();
          FileReader reader = new FileReader("C:\\Users\\Sindhoori\\Desktop\\java\\sample.txt");
          BufferedReader br= new BufferedReader(reader);
          String line;
          System.out.println("\n Data Read From The Sample File \n");
          while ((line = br.readLine()) != null) {
              System.out.println(line);
          }
          reader.close();

      } catch (IOException e) {
          System.out.println("\n Error Occured.");
      }

  }


}