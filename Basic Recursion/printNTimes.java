//You are given an integer ‘n’.
//Print “Coding Ninjas ” ‘n’ times, without using a loop.
import java.util.ArrayList;
import java.util.List;
public class printNTimes {
    public static List<String> printNtimes(int n){
        // Write your code here.
        List<String> result = new ArrayList<String>(n);
        return printCodingNinjas(n, result);
    }

    public static List<String> printCodingNinjas(int n, List<String> result) {
        if(n < 1) {
            return result;
        }
        printCodingNinjas(n - 1, result);
        result.add("Coding Ninjas");
        return result;
    }
}
