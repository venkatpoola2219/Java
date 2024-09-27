package Java.Mouritech.Venkat1;

import java.util.*;

import java.util.Arrays;

public class ArrayTaskTCS {

    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 2;
        int[] result = maxSlidingWindow(arr, k);
        System.out.println(Arrays.toString(result));
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return new int[0];
        }

        int n = nums.length;
        int[] result = new int[n - k + 1];

        // Iterate through each window
        for (int i = 0; i <= n - k; i++) {
            int max = nums[i];
            // Find the maximum in the current window
            for (int j = i; j < i + k; j++) {
                if (nums[j] > max) {
                    max = nums[j];
                }
            }
            result[i] = max;
        }

        return result;
    }
}
