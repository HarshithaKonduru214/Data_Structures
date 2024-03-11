//Print the below Pattern, for the given value of N
//* * *
//* *
//*
public class Pattern5 {
    public static void seeding(int n) {
        // Write your code here
        for(int i = n + 1; i > 0; i--) {
            for(int j = 1; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
