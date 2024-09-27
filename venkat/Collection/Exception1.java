package Java.Mouritech.venkat.Collection;
import java.sql.*;
public class Exception1 {

	public static void main(String[] args){
		try {
		int a=5;
		int b=0;
		System.out.println(a/b);
		}
		catch(Exception e) {
			System.out.println("error");
		}
		System.out.println("bye");

	}

}
