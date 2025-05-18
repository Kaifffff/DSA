public class DimondPattern {
    //      *
    //     ***
    //    ***** 
    //   *******
    //   *******
    //    *****
    //     ***
    //      *
    public static void Dimond(int n){
        //first half
        for(int i = 1 ; i <= n;i++){
            // print spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //print stars
            for(int j=1;j<=(2*i)-1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //second half
        for(int i = n ; i >= 1;i--){
            // print spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //print stars
            for(int j=1;j<=(2*i)-1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String []args){
        Dimond(6);
    }
}
