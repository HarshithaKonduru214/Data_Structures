//You are given an m x n integer grid accounts where accounts[i][j] 
//is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. 
//Return the wealth that the richest customer has.
//A customer's wealth is the amount of money they have in all their bank accounts. 
//The richest customer is the customer that has the maximum wealth.
public class Solution1672 {
    public int maximumWealth(int[][] accounts) {
        int maximumWealth = 0;
        

        for(int customer = 0; customer < accounts.length; customer++ ) {
            int totalCustomerWealth = 0;
            for(int bank = 0; bank < accounts[customer].length; bank++) {
                totalCustomerWealth += accounts[customer][bank];
            }
            if (maximumWealth < totalCustomerWealth) {
                maximumWealth = totalCustomerWealth;
            }
        }
        return maximumWealth;
    }
}
