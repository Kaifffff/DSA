public class MaximumSubArraySum {

//     1361015
//     25914
//     3712
//     49
//     5
//     maximum sum : 15

    public static void printSum(int[] num){
        int currSum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < num.length ; i++){
            int start = i;
            for(int j = i ; j < num.length ; j++){
                int end = j;
                currSum=0;
                for(int k = start ; k <= end ; k++){
                    currSum+=num[k];

                }
                System.out.print(currSum);
                if(max < currSum){
                    max = currSum;
                }
            }
            System.out.println();
        }
        System.out.println( " maximum sum : " + max);
    }
    public static void main(String[] args) {
        int num[] = { 1,2,3,4,5};
        printSum(num);
    }
}
