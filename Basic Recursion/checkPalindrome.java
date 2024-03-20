//Determine if a given string ‘S’ is a palindrome using recursion. 
//Return a Boolean value of true if it is a palindrome and false if it is not.
public class checkPalindrome {
    public static boolean isPalindrome(String str) {
        // Write your code here.
        return palindrome(0, str.length() - 1, str);
    }

    public static boolean palindrome(int start, int end, String str) {
        if(start >= end) {
            return true;
        }
        if(str.charAt(start) != str.charAt(end)) {
            return false;
        } else {
            return palindrome(start + 1, end - 1, str);
        }
    }
}
