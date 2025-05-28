public class MaximumSubArraySum {

//     1361015
//     25914
//     3712
//     49
//     5
//     maximum sum : 15

 
    // it is bad approach  space complexity big O(n cube ) 
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

    //using prefix space complaxity  big O(n square) // brute force algorithom
    public static void prefixPrintSum(int[] num){
        int currSum = 0;
        int max = Integer.MIN_VALUE;
        int prefix[] = new int[num.length];

        prefix[0] = num[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i] = prefix[i - 1] + num[i]; 
        }



        for(int i = 0; i < num.length ; i++){
            int start = i;
            for(int j = i ; j < num.length ; j++){
                int end = j;
                currSum=start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                System.out.print(currSum);
                if(max < currSum){
                    max = currSum;
                }
            }
            System.out.println();
        }
        System.out.println( " maximum sum : " + max); 
    }


    // kadanes algorithom
    public static void kadanes(int[] n){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i = 0 ; i < n.length ; i++){
            cs = cs + n[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs , ms);
        }

        System.out.println("Maximum sum is :" + ms);

    }
    public static void main(String[] args) {
        int num[] = { 1,2,3,4,5};
        // printSum(num);
        // prefixPrintSum(num);
        kadanes(num);
    }
}
