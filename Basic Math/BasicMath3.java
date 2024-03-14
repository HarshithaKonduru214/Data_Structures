//You are given a number ’n’.
//Find the number of digits of ‘n’ that evenly divide ‘n’.
public class BasicMath3 {
    public static int countDigits(int n){
        // Write your code here.
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
