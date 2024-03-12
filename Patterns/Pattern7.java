//Print the below Pattern, for the given value of N
//  *
// ***
//*****
public class Pattern7 {
    public static void nStarTriangle(int n) {
        // Write your code here
        for(int i = 0; i < n; i++) {
            //Print the spaces
            for(int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            //Print the stars
            for(int j = 0; j < 2 * i  + 1; j++) {
                System.out.print("*");
            }

            //Print the spaces
            for(int j = 0; j < n - i + 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
