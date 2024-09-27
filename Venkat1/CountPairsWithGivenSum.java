package Java.Mouritech.Venkat1;

import java.util.Scanner;

public class CountPairsWithGivenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        System.out.print("Enter the size of the array (N): ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target sum (k): ");
        int k = sc.nextInt();
        int count = countPairsWithSum(arr, k);
        System.out.println("Number of pairs with sum " + k + " is: " + count);
    }

    public static int countPairsWithSum(int[] arr, int k) {
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == k) {
                    count++;
                }
            }
        }
        return count;
    }
}
