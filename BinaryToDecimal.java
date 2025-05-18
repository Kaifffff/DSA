public class BinaryToDecimal {


    public static void BinToDecimal(int n){
        int num = n;
        int pow = 0;
        int decNum = 0;
        while(n > 0){
            int lastDig = n % 10 ;
            decNum = decNum + (lastDig * (int)Math.pow(2,pow));
            pow++;
            n = n/10;
        }
        System.out.println("decimal of " + num + " is " + decNum);
    }

    public static void DecToBin(int n ){
        int num = n;
        int pow = 0;
        int binNum = 0;

        while(n > 0){
            int rem = n%2;
            binNum = binNum + (rem * (int)Math.pow(10, pow));
            pow++;
            n = n/2;
        }
        System.out.println("Binary of " + num + " is " + binNum);
    }

    public static void main(String []args){
//        BinToDecimal(101);
        DecToBin(7);
    }
}
