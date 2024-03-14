//Print the below Pattern, for the given value of N
//A B C
//A B
//A
public class Pattern15 {
    public static void nLetterTriangle(int n) {
        // Write your code here
        for(int row = 0; row < n; row++) {
            for(char column = 'A'; column < 'A' + (n - row); column++) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}
