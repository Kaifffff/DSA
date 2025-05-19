package Arrays;

public class PairesInArray {
    public static void Paires(int arr[]){
        int tp = 0;
        for(int i = 0; i < arr.length ; i++){
            int curr = arr[i];
            for(int j = i+1; j<arr.length;j++){
                System.out.print("(" + curr + "," + arr[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total paire is : " + tp);
    }
    public static void main(String []args){
        int arr[] = {1,2,3,4,5,6};
        Paires(arr);
    }
}
