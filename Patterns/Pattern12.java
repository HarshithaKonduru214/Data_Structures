//Print the below Pattern, for the given value of N
//1       1
//1 2   2 1
//1 2 3 2 1
public class Pattern12 {
    public static void numberCrown(int n) {
        // Write your code here.
        for(int row = 0; row < n; row++) {
            int numbersUpto = row + 1;
            int spaces = 2 * (n - row - 1);

            for(int column = 0; column < numbersUpto; column++) {
                System.out.print(column + 1 + " ");
            }

            for(int column = 0; column < spaces; column++) {
                System.out.print("  ");
            }

            for(int column = numbersUpto; column > 0; column--) {
                System.out.print(column + " ");
            }

            System.out.println();
        }
    }
    
}
