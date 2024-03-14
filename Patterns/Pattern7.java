//Print the below Pattern, for the given value of N
//  *
// ***
//*****
public class Pattern7 {
    public static void nStarTriangle(int n) {
        // Write your code here
        for(int row = 0; row < n; row++) {
            int numberOfSpaces = n - row - 1;
            int numberOfStars = 2 * row + 1;

            for(int column = 0; column < numberOfSpaces; column++) {
                System.out.print(" ");
            }

            for(int column = 0; column < numberOfStars; column++) {
                System.out.print("*");
            }

            for(int column = 0; column < numberOfSpaces; column++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
