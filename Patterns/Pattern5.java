//Print the below Pattern, for the given value of N
//* * *
//* *
//*
public class Pattern5 {
    public static void seeding(int n) {
        // Write your code here
        for(int row = 0; row < n; row++) {
            for(int column = 0; column < n - row; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
