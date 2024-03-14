//Print the below Pattern, for the given value of N
//C
//C B 
//C B A
public class Pattern18 {
    public static void alphaTriangle(int n) {
        // Write your code here
        for(int row = 0; row < n; row++) {
            char alphabet = (char)((int)'A' + n - 1);
            for(int column = 0; column < row + 1; column++) {
                System.out.print(alphabet + " ");
                alphabet -= 1;
            }
            System.out.println();
        }
    }
}
