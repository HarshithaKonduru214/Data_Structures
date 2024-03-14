//Print the below Pattern, for the given value of N
//    A
//  A B A
//A B C B A
public class Pattern17 {
    public static void alphaHill(int n) {
        // Write your code here
        for(int row = 0; row < n; row++) {
            int spaces = n - row - 1;
            int alphabets = 2 * row + 1;

            for(int column = 0; column < spaces; column++) {
                System.out.print("  ");
            }

            char alphabet = 'A';
            for(int column = 0; column < alphabets; column++) {
                if(column < alphabets / 2) {
                    System.out.print(alphabet + " ");
                    alphabet += 1;
                } else {
                    System.out.print(alphabet + " ");
                    alphabet -= 1;
                }
                
                
            }

            for(int column = 0; column < spaces; column++) {
                System.out.print("  ");
            }

            System.out.println();
        }
    }
}
