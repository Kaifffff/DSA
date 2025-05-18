public class ButterflyPattern {
    // *    *
    // **  **
    // ******
    // ******
    // **  **
    // *    *
    public static void Butterfly(int n){
        //First half
        for(int i = 1 ; i <= n ; i++){
            //print star
            for(int j = 1 ; j <= i ; j ++){
                System.out.print("*");
            }

            //print spaces
            for(int j=1 ; j <= 2*(n-i) ; j++){
                System.out.print(" ");
            }

            //print star
            for(int j=1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //second half
        for(int i = n ; i >= 1 ; i--){
            //print star
            for(int j = 1 ; j <= i ; j ++){
                System.out.print("*");
            }

            //print spaces
            for(int j=1 ; j <= 2*(n-i) ; j++){
                System.out.print(" ");
            }

            //print star
            for(int j=1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String []args){
        Butterfly(6);
    }
}
