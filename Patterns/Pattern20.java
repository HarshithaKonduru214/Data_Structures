//Print the below Pattern, for the given value of N
//*    *
//**  **
//******
//**  **
//*    *
public class Pattern20 {
    public static void symmetry(int n) {
        // Write your code here
        for(int row = 0; row < 2 * n - 1; row++) {
            //Stars
            int stars = row < n ? row + 1 : 2 * n - row - 1;
            for(int column = 0; column < stars; column++) {
                System.out.print("* ");
            }

            //Spaces
            int spaces = row < n ? 2 * (n - row - 1) : 2 * (row - n + 1);
            for(int column = 0; column < spaces; column++) {
                System.out.print("  ");
            }
            //Stars
            for(int column = 0; column < stars; column++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        
    }
}
