//268 missing number
class Solution268 {
    public int missingNumber(int[] nums) {
        //main Logic
        int xorResult = nums.length;
        for (int i = 0; i < nums.length; i++) {
            xorResult ^= i;
            xorResult ^= nums[i];
        }
        return xorResult;
    }

    public static void main(String[] args) {
        int[] nums = {3, 0, 1, 2, 5};
        Solution268 obj = new Solution268();
        int result = obj.missingNumber(nums);
        System.out.println("Missing Number = " + result);
    }
}