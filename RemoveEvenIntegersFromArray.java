import java.util.*;

/***
*
* Remove Even Integers from an Array
* 
**/
public class Main 
{
    public static void printArray(int[] arr) 
    {
        for (int i = 0; i < (arr.length); i++) {
            System.out.println(arr[i]);
        }
    }
    
    public static int[] removeEvenInt(int[] arr) 
    {
        int oddCount = 0;
        for (int i = 0; i < (arr.length); i++) {
            if (arr[i] % 2 != 0) {
                oddCount++;
            }
        }
        
        int[] newArr = new int[oddCount];
        int j = 0;
        
        for (int i = 0; i < (arr.length); i++) {
            if (arr[i] % 2 != 0) {
                newArr[j] = arr[i];
                j++;
            }
        }
        return newArr;
    }
    
    public static void main(String[] args) throws Exception 
    {
        int[] arr = {2, 3, 4, 1, 10, 9, 4};
        int[] newArr = removeEvenInt(arr);
        printArray(newArr);
    }
}
