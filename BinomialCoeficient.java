public class BinomialCoeficient {

    public static int fact(int n){
        int fact = 1;
        for(int i = 1 ; i <= n ; i++){
            fact = fact * i;

        }
        int result = fact;
        return result;
    }

    public static int bincoef(int n , int r){
        int fact_r = fact(r);
        int fact_n = fact(n);
        int fact_nmr = fact(n-r);

        int result = fact_n / (fact_r * fact_nmr);
        return result;
    }

    public static void main(String []args){
        System.out.println(bincoef(5,2));
    }
}
