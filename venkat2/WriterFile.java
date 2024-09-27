package Java.Mouritech.venkat2;

import java.io.FileWriter;
import java.io.IOException;

public class WriterFile {
	public static void main(String[] args) {
		try {
		FileWriter f = new FileWriter("filename.txt");
		f.write("Hello Venkat How are You");
		f.close();
		System.out.println("Successfully written");
	}
	catch (IOException e){
		System.out.println("An error occured");
		e.printStackTrace();
		
	}
}

}
