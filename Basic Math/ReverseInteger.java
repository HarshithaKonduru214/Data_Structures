public class ReverseInteger {
    public int reverse(int x) {
        int sign = x > 0 ? 1 : -1;
        x *= sign;
        int reversedNumber = 0;
        while(x > 0) {
            int digit = x % 10;
            int newNumber = reversedNumber * 10 + digit;
            //Check for overflow
            if((newNumber - digit) / 10 != reversedNumber) {
                return 0;
            } else {
                reversedNumber = newNumber;
            }
            x /= 10;
        }
        return reversedNumber * sign;
    }
}
