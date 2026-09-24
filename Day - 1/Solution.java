class Solution {
    public int findNumbers(int[] nums) {
        int evenCount = 0;
        // Traverse each number in the array
        for (int num : nums) {
            // Convert number to String and find its length
            int len = String.valueOf(num).length();
            // Check whether number of digits is even
            if (len % 2 == 0) {
                evenCount++;
            }
        }
        return evenCount;
    }

    public static void main(String[] args) {

        Solution obj = new Solution();
        int[] nums = {12, 345, 2, 6, 7896};
        int result = obj.findNumbers(nums);
        System.out.println("Numbers with even number of digits: " + result);
    }
}