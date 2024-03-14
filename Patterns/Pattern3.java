//Print the below Pattern, for the given value of N
//1
//1 2 
//1 2 3
public class Pattern3 {
    public static void nTriangle(int n) {
        // Write your code here
        for(int row = 0; row < n; row++) {
            int numbers = row + 1;
            for(int column = 0; column < numbers; column++) {
                System.out.print(column + 1 + " ");
            }
            System.out.println();
        }
    }
}
