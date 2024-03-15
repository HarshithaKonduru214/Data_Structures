public class CheckArmstrong {
    public boolean checkArmstrong(int n){
        //Write your code here
        int totalSum = 0;
        int originalNumber = n;
        int numberOfDigits = 0;
    
        while(n > 0) {
            numberOfDigits += 1;
            n /= 10;
        }
    
        n = originalNumber;
        while(n > 0) {
            int digit = n % 10;
            int partialSum = 1;
            for(int i = 0; i < numberOfDigits; i++) {
                partialSum *= digit;
            }
            totalSum= totalSum + partialSum;
            n /= 10;
        }
    
        return (originalNumber == totalSum) ? true : false;
    }
}
