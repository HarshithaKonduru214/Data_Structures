//Print the below Pattern, for the given value of N
//1 2 3
//1 2
//1
public class Pattern6 {
    public static void nNumberTriangle(int n) {
        // Write your code here
        for(int i = n + 1; i > 0; i--) {
            for(int j = 1; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
