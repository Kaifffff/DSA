public class PrintSubArray {

// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5
// 2
// 2 3
// 2 3 4
// 2 3 4 5
// 3
// 3 4
// 3 4 5
// 4
// 4 5
// 5
    public static void subarray(int[] num){
        for(int i = 0; i < num.length ; i++){
            int start = i;
            for(int j = i ; j < num.length ; j++){
                int end = j;
                for(int k = start ; k <= end ; k++){
                    System.out.print(num[k] + " ");
                }
                System.out.println();
            }
        
        }
    }
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5};
        subarray(num);
    }
}
