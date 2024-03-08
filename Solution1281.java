//Given an integer number n, return the difference between the product of its digits
//and the sum of its digits.
public class Solution1281 {
    public int subtractProductAndSum(int n) {
        //Space Complexity - O(1)
        //Time Complexity - O(N) - Suppose there are N digits in the number n
        
        //Initialize the product to 1 and sum to 0
        int product = 1;
        int sum = 0;

        //Compute the product and sum of its digits
        while(n > 0) {
            //Fetch the last digit
            int lastDigit = n % 10;

            //Multiply the digit with the product
            product = product * lastDigit;
            //Add the digit to the sum
            sum = sum + lastDigit;
            
            //Remove the last digit from the number
            n = n / 10;
        }

        //Return the difference between product and sum
        return product - sum;
    }
}
