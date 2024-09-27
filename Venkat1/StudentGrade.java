package Java.Mouritech.Venkat1;
import java.util.*;

public class StudentGrade {
    public static void main(String[] args) {
        int a, b, c, d, e, total, avg;
        
        System.out.println("Enter the values for a, b, c, d, e:");
        Scanner sc = new Scanner(System.in);
        
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();
        
        total = (a + b + c + d + e);
        avg = total / 5;
        
        System.out.println("Total = " + total);
        System.out.println("Average = " + avg);
        
        if (avg >= 80) {
            System.out.println("Grade: A");
        } else if (avg >= 70) {
            System.out.println("Grade: B");
        } else if (avg >= 60) {
            System.out.println("Grade: C");
        } else if (avg >= 50) {
            System.out.println("Grade: D");
        } else if (avg >= 40) {
            System.out.println("Grade: E");
        } else {
            System.out.println("Fail");
        }
    }
}
