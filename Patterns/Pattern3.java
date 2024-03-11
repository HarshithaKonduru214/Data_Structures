//Print the below Pattern, for the given value of N
//1
//1 2 
//1 2 3
public class Pattern3 {
    public static void nTriangle(int n) {
        // Write your code here
        for(int i = 1; i < n + 1; i++) {
            for(int j = 1; j < i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
