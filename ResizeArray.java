import java.util.*;

/***
*
*  Resize an Array
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
    
    public static int[] resize(int[] arr, int capacity) 
    {
        int[] temp = new int[capacity];
        
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
       
        return temp;
    }
    
    public static void main(String[] args) throws Exception 
    {
        int[] arr = {5, 9, 3, 10};
        int[] newArray = resize(arr, 8);
        printArray(newArray);
    }
}
