public class Halfpyramid {
    public static void main(String[] args) {
        //half pyramid pattern
        //1
        //12
        //123
        //1234
        int n =4;
        for(int line=1;line<=n;line++){
            for(int j=1;j<=line;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        
    }
}

