//Print the below Pattern, for the given value of N
//* 
//* * 
//* * *
public class Pattern2 {
    public static void nForest(int n) {
        // Write your code here
        for(int row = 0; row < n; row++) {
            int numberOfStars = row + 1;
            for(int column = 0; column < numberOfStars ; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
