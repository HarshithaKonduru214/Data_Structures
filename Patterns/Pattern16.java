//Print the below Pattern, for the given value of N
//A
//B B
//C C C 
public class Pattern16 {   
    public static void alphaRamp(int n) {
        // Write your code here
        for(int row = 0; row < n; row++) {
            for(int column = 0; column < row + 1; column++) {
                char alphabet = (char)((char)'A' + row);
                System.out.print(alphabet + " ");
            }
            System.out.println();
        }
    }
}
