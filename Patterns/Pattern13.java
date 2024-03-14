//Print the below Pattern, for the given value of N
//1
//2 3
//4 5 6
public class Pattern13 {
    public static void nNumberTriangle(int n) {
        // Write your code here
        int rowStartsWith = 1;
        for(int row = 0; row < n; row++) {
            for(int column = 0; column < row + 1; column++) {
                System.out.print(rowStartsWith + " ");
                rowStartsWith += 1;
            }
            System.out.println();
        }
    }
}
