import java.util.Scanner;

public class Factorial {
    public static int Fact(int n){
        int f = 1;
        for(int i = 1 ; i <= n ; i++)
            f = f * i;
            return f;

    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result = Fact(a);
        System.out.print(result);

    }
}
