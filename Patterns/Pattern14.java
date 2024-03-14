//Print the below Pattern, for the given value of N
//A
//A B
//A B C
public class Pattern14 {
    public static void nLetterTriangle(int n) {
        // Write your code here
        for(int row = 0; row < n; row++) {
            for(char column = 'A'; column < 'A' + row + 1; column++) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}
