//You are given an integer ‘n’.
//Your task is to return an array containing integers from ‘n’ to ‘1’ 
//(in decreasing order) without using loops.
public class NToOneWithoutLoop {
    public static int[] printNos(int x) {
        // Write Your Code Here
        int[] result = new int[x];
        result = printNTo1(x, result, 0);
        return result;

    }

    public static int[] printNTo1(int n, int[] result, int index) {
        if(n < 1) {
            return result;
        } else {
        result[index] = n;
        printNTo1(n - 1, result, index + 1);
        return result;
        }
    }
}
