public class Missing {

    public int missingNumber(int[] nums) {
        int n = nums.length;
        int xor_one = 0, xor_two = 0;

        for (int i = 0; i <= n; i++) {
            xor_one ^= i;
        }

        for (int x : nums) {
            xor_two ^= x;
        }

        return xor_one ^ xor_two;
    }

    public static void main(String[] args) {
        Missing obj = new Missing();

        int[] nums = {3, 0, 1};

        int result = obj.missingNumber(nums);

        System.out.println("Missing number = " + result);
    }
}