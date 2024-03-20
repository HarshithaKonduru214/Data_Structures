//You are given an integer ‘n’.
//Your task is to return an array containing integers from 1 to ‘n’ 
//(in increasing order) without using loops.
public class oneToNWithoutLoop {
    public static int[] printNos(int x) {
        // Write Your Code Here
        int[] result = new int[x];
        return print1ToN(x, result);

    }

    public static int[] print1ToN(int x, int[] result) {
        if(x < 1) {
            return result;
        }
        print1ToN(x-1, result);
        result[x-1] = x;
        return result;
    }
}
