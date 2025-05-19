package Arrays;

public class BSearch {
    public static int BinaryS(int arr[] , int key){
        int start=0,end=arr.length-1;
        int mid = (start + end ) / 2;
        while(start <= end){
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] < key){
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }
        return -1;
    }
    public static void main(String []args){
        int arr[]={1,2,3,4,5};
        int key = 4;
        int index = BinaryS(arr, key);
        System.out.print("index of key is "+ index);
    }
}
