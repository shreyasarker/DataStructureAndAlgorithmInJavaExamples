import java.util.*;

/***
*
* Find Second Maximum Value in an Array
* 
**/
public class SecondMaximumValueInArray 
{
    public static int findSecondMaximum(int[] arr) 
    {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
            else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
       
        return secondMax;
    }
    
    public static void main(String[] args) throws Exception 
    {
        int[] arr = {13, 34, 2, 34, 33, 1, 5};
        int maxValue = findSecondMaximum(arr);
        System.out.println(maxValue);
    }
}
