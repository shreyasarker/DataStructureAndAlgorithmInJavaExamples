import java.util.*;

/***
*
* Find Missing Number in an Array
* Approach: We will use Sum of Natural Numbers to solve this.
* 1 + 2 + 3 + 4 + .... = n * (n + 1) / 2
* 
**/
public class Main 
{
    public static int findMissingNumber(int[] arr) 
    {
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;
        for (int i = 0; i < (arr.length); i++) {
            sum-=arr[i];
        }
        
        return sum;
    }
    
    public static void main(String[] args) throws Exception 
    {
        int[] arr = {2, 3, 4, 1, 5, 7};
        int missingNumber = findMissingNumber(arr);
        System.out.println(missingNumber);
    }
}
