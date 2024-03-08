//Given an integer array nums of length n, you want to create an array ans 
//of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 
//0 <= i < n (0-indexed).
//Specifically, ans is the concatenation of two nums arrays.
public class Solution1929 {
    public int[] getConcatenation(int[] nums) {
        int size = nums.length;
        int[] ans = new int[2 * size];

        for(int i = 0; i < 2 * size; i++) {
            int index = i % size;
            ans[i] = nums[index];
        }
        return ans;
    }
}
