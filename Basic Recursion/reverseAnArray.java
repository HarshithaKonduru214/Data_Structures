//Return an array with all the elements placed in reverse order.
public class reverseAnArray {
    public static int[] reverseArray(int n, int []nums) {
        // Write your code here.
        return reverse(0, n - 1, nums);
    }

    public static int[] reverse(int start, int last, int[] nums) {
        if(start >= last) {
            return nums;
        } else {
            //Swap numbers
            int temp = nums[start];
            nums[start] = nums[last];
            nums[last] = temp;
            reverse(start + 1, last - 1, nums);
            return nums;
        }
    }
}
