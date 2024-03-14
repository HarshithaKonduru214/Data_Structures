//Print the below Pattern, for the given value of N
//4444444
//4333334
//4322234
//4321234
//4322234
//4333334
//4444444
public class Pattern22 {
    public static void getNumberPattern(int n) {
        // Write your code here.
        for(int row = 0; row < 2 * n - 1; row++) {
            for(int column = 0; column < 2 * n - 1; column++) {
                int topDistance = row;
                int leftDistance = column;
                int bottomDistance = 2 * (n - 1) - row;
                int rightDistance = 2 * (n - 1) - column;
                int minDistance = Math.min(Math.min(topDistance, bottomDistance), Math.min(leftDistance, rightDistance));
                System.out.print(n - minDistance);
            }
            System.out.println();
        }
    }
}
