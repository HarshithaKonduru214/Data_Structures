//Given an array nums. We define a running sum of an array as 
//runningSum[i] = sum(nums[0]…nums[i]).
public class Solution1480 {
    public int[] runningSum(int[] nums) {
        int size = nums.length;
        int[] ans = new int[size];

        int runningSum = 0;

        for(int i = 0; i < size; i++) {
            runningSum += nums[i];
            ans[i] = runningSum;
        }
        return ans;
    }
}
