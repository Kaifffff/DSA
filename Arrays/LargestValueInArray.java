package Arrays;
import java.util.*;

public class LargestValueInArray {
    public static int Largest(int arr[]){
        int largest = Integer.MIN_VALUE;  // -infinity 
        for(int i = 0; i < arr.length ; i++){
            if( largest < arr[i]){
                largest = arr[i];
            }

        }
        return largest;
    }
    public static void main(String []args){
        int arr[] = {12,13,14,10,4,50};
        System.out.print("largest in array is : " + Largest(arr));
    }
}
