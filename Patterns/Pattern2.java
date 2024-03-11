//Print the below Pattern, for the given value of N
//* 
//* * 
//* * *
public class Pattern2 {
    public static void nForest(int n) {
        // Write your code here
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
