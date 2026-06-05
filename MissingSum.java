// Missing number using formula n * (n + 1) / 2
 
public class MissingSum {

    public int missingNumber(int[] nums) {

        int n = nums.length;

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int i = 0; i < n; i++) {
            actualSum += nums[i];
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {

        MissingSum obj = new MissingSum();

        int[] nums = {3, 0, 1};

        int result = obj.missingNumber(nums);

        System.out.println("Missing number = " + result);
    }
}