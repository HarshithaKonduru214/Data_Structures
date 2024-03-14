//Print the below Pattern, for the given value of N
//1
//0 1
//1 0 1
public class Pattern11 {
    public static void nBinaryTriangle(int n) {
        // Write your code here.
        for(int row = 0; row < n; row++) {
            int startsWith = 1 - (row % 2);
            for(int column = 0; column < row + 1; column++) {
                System.out.print(startsWith + " ");
                startsWith = 1 - startsWith;
            }
            System.out.println();
        }
    }
}
