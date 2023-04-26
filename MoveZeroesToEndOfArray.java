import java.util.*;

/***
*
*  Move Zeroes to End of an Array
* 
**/
public class MoveZeroesToEndOfArray 
{
    public static void printArray(int[] arr) 
    {
        for (int i = 0; i < (arr.length); i++) {
            System.out.println(arr[i]);
        }
    }
    
    public static int[] moveToZeroes(int[] arr) 
    {
        int j = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[i] != arr[j]) {
                j++;
            }
        }
       
        return arr;
    }
    
    public static void main(String[] args) throws Exception 
    {
        int[] arr = {8, 1, 0, 2, 1, 0, 3};
        int[] newArray = moveToZeroes(arr);
        printArray(newArray);
    }
}
