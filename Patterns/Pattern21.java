//Print the below Pattern, for the given value of N
//****
//*  *
//*  *
//****
public class Pattern21 {
    public static void getStarPattern(int n) {
        // Write your code here
        for(int row = 0; row < n; row++) {
            for(int column = 0; column < n; column++) {
                if(row == 0 || row == n - 1 || column == 0 || column == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
