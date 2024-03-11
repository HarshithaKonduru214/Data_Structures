public class Solution1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        int index = 0;
        for(int i = 0; i < n; i++) {
            ans[index] = nums[i];
            ans[index + 1] = nums[i+n];
            index += 2;
        }
        return ans;
    }
}
