//Your task is determining the sum of the first ‘n’ natural numbers and returning it.
public class sumOfFirstNNumbers {
    public static long sumFirstN(long n) {
        // Write your code here.
        return sumOfN(n, 0);
    }

    public static long sumOfN(long n, long sum) {
        if(n == 0) {
            return sum;
        }
        return n * (n + 1) / 2;
    }
}
