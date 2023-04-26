import java.util.*;

/***
*
* Find Minimum Value in an Array
* 
**/
public class MinimumValueInArray 
{
    public static int findMinimum(int[] arr) 
    {
        int min = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
       
        return min;
    }
    
    public static void main(String[] args) throws Exception 
    {
        int[] arr = {6, 11, 3, -7, 1, 4, 5};
        int minValue = findMinimum(arr);
        System.out.println(minValue);
    }
}
