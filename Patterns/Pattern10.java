//Print the below Pattern, for the given value of N
//*
//**
//***
//**
//*
public class Pattern10 {
    public static void nStarTriangle(int n) {
        // Write your code here
        for(int row = 0; row < 2 * n - 1; row++) {
            int numberOfStars = ( row < n ) ? row + 1 : (2 * n - row) - 1;

            for(int column = 0; column < numberOfStars; column++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
