//Print the below Pattern, for the given value of N
//******
//**  **
//*    *
//*    *
//**  **
//******
public class Pattern19 {
    public static void symmetry(int n) {
        // Write your code here
        for(int row = 0; row < n; row++) {
            int stars = n - row;
            int spaces = 2 * row;

            for(int column = 0; column < stars; column++) {
                System.out.print("* ");
            }

            for(int column = 0; column < spaces; column++) {
                System.out.print("  ");
            }

            for(int column = 0; column < stars; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int row = 0; row < n; row++) {
            int stars = row + 1;
            int spaces = 2 * (n - row - 1);

            for(int column = 0; column < stars; column++) {
                System.out.print("* ");
            }

            for(int column = 0; column < spaces; column++) {
                System.out.print("  ");
            }

            for(int column = 0; column < stars; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
