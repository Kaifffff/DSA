public class HolloRhombusPattern {
    //     *****
    //    *   *
    //   *   *
    //  *****
    public static void HolloRhombus(int n){
        for(int i=1;i<=n;i++){
            // print spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            // print stars
            for(int j=1;j<=n;j++){
                if(i == 1 || i == n || j == 1 || j == n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String []args){
        HolloRhombus(6);
    }
}
