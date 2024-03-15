public class GCDorHCF {
    public static int calcGCD(int n, int m){
        // Write your code here.
        //Time complexity - O(min(n,m))
        // int greatestDivisor = 0;
        // int minNumber = n < m ? n : m;
        // for(int i = minNumber; i > 0 ; i--) {
        //     if(n % i == 0 && m % i == 0 && greatestDivisor < i) {
        //         greatestDivisor = i;
        //     }
        // }
        // return greatestDivisor;
        
        //Time complexity - O(log(min(n,m)))
        while(n > 0 && m > 0) {
            if(n > m) n %= m;
            else m %= n;
        }

        if(n == 0) return m;
        else return n;
    }
}
