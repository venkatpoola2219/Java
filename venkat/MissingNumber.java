package Java.Mouritech.venkat;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1, 4, 6, 2};
        int missingNumber = findMissingNumber(nums);
        System.out.println("Missing Number: " + missingNumber);
    }
    
    public static int findMissingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n * (n + 1)) / 2;
        for (int i=0;i<n;i++) {
            sum =sum- nums[i];
        }
        return sum;
    }
}
