package Java.Mouritech.venkat;

import java.util.Scanner;

public class Cubesum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i * i * i;
        }
        System.out.println(sum);
    }
}

