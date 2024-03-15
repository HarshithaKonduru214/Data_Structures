public class CountDigits {
    public static int countDigits(int n){
        // Write your code here.
        //Time complexity - O(log10(n))
        int number = n;
        int count = 0;
        while(number > 0) {
            int digit = number % 10;
            number /= 10;
            if(digit != 0 && n % digit == 0) {
                count += 1;
            }
        }
        return count;
    }
}
