package Arrays;

public class LinearSearch {
    public static int LinearS(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    } 
    public static void main(String []args){
        int arr[] = {12 , 13 , 14 , 10};
        int key = 10;
        int index = LinearS(arr , key);
        System.out.println("key present on index :" + index);
    }
}
