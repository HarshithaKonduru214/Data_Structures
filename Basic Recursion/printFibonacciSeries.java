//Given an integer ‘n’, return first n Fibonacci numbers using a generator function.
public class printFibonacciSeries {
    public static int[] generateFibonacciNumbers(int n) {
        // Write your code here.
        int[] result = new int[n];
        if(n > 1){
            result[0] = 0;
            result[1] = 1;
            for(int i = 2; i < n; i++) {
                result[i] = result[i - 1] + result[i - 2];
            }
        }
        return result;  
    }
}
