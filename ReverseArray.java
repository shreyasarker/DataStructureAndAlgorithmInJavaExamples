import java.util.*;

/***
*
* Reverse an Array
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
    
    public static int[] reverseArray(int[] arr, int start, int end) 
    {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
            
        }
       
        return arr;
    }
    
    public static void main(String[] args) throws Exception 
    {
        int[] arr = {3, 4, 6, 1, 2, 6, 8};
        int start = 0;
        int end = arr.length - 1;
        int[] newArr = reverseArray(arr, start, end);
        printArray(newArr);
    }
}
