import java.util.*;

/***
*
* Check if a given String is a Palindrome
* 
**/
public class Main 
{
    public static Boolean findPalindrome(String str) 
    {
        char[] charArray = str.toCharArray();
        int start = 0;
        int end = str.length() - 1;
        
        while(start < end) {
            if (charArray[start] != charArray[end]) {
                return false;
            }
            start++;
            end--;
        }
        
        return true;
    }
    
    public static void main(String[] args) throws Exception 
    {
        String str = "madam";
        Boolean palindrome = findPalindrome(str);
        System.out.println(palindrome);
    }
}
