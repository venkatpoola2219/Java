package Java.Mouritech.venkat2;

import java.io.File; 

public class FileDelete {
  public static void main(String[] args) { 
    File f = new File("test"); 
    if (f.delete()) { 
      System.out.println("Deleted the file: " + f.getName());
    } else {
      System.out.println("Failed to delete the file.");
    } 
  } 
}
