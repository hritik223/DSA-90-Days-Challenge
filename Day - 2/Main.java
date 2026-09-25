import java.util.Arrays;
class Main {
    public int[] sortedSquares(int[] nums){
        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++){
            result[i] = nums[i] * nums[i];
        }
        Arrays.sort(result);
        return result;
    }
     public static void main(String[] args) {

        Main obj = new Main();
        int[] nums = {-4,-1,0,3,10};
        int [] result = obj.sortedSquares(nums);
        System.out.println(" squares of each number sorted in non-decreasing order: " + Arrays.toString (result));
    }
}