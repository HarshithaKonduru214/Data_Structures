//Print the below Pattern, for the given value of N
//* * *
//* * *
//* * *
public class Pattern1 {
    public static void nForest(int n) {
        // Write your code here
        for(int row = 0; row < n; row++) {
            for(int column = 0; column < n; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
