class Solution42 {
    public int trap(int[] height) {
        int n = height.length;
        int ans = 0;
        int l = 0, r = n - 1;
        int lmax = 0, rmax = 0;

        while (l < r) {
            lmax = Math.max(lmax, height[l]);
            rmax = Math.max(rmax, height[r]);

            if (lmax < rmax) {
                ans += lmax - height[l];
                l++;
            } else {
                ans += rmax - height[r];
                r--;
            }
        }

        return ans;
    }

     public static void main(String[] args) {
        int[] height = {4, 2, 0, 3, 2, 5};
        Solution42 obj = new Solution42();
        int ans = obj.trap(height);
        System.out.println("Trap Water = " + ans);
    }
}