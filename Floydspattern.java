public class Floydspattern {
    public static void main(String[] args) {
        //1
        //23
        //456
        //78910
        int n = 4;
        int count = 1;

        for(int i = 1 ; i<=n ; i++){
            for(int j = 1 ; j<=i ; j++){
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }
}
