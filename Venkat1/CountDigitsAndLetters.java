package Java.Mouritech.Venkat1;

import java.util.Scanner;

public class CountDigitsAndLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        int digitCount = 0;
        int letterCount = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= '0' && c <= '9') {
                digitCount++;
            }
            else if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
                letterCount++;
            }
        }
        System.out.println("Number of digits: " + digitCount);
        System.out.println("Number of letters: " + letterCount);
    }
}
