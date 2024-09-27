package Java.Mouritech.Venkat1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

public class Date2 {
	public static void main(String[] args) {
		Date d=new Date();
		System.out.println(d);
		Calendar c=Calendar.getInstance();
		System.out.println(c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
		LocalDateTime l=LocalDateTime.now();
		System.out.println(l);
		LocalDate l1=LocalDate.now();
		System.out.println(l1);
		LocalTime l2=LocalTime.now();
		System.out.println(l2);
	}
}
