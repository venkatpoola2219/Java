package Java.Mouritech.venkat2;

import java.io.File;   
import java.util.Scanner; 

public class ReadFile {
  public static void main(String[] args) {
    try {
      File f = new File("filename.txt");
      Scanner sc = new Scanner(f);
      while (sc.hasNextLine()) {
        String data = sc.nextLine();
        System.out.println(data);
      }
      sc.close();
    } catch (Exception e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
