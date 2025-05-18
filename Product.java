import java.net.StandardSocketOptions;
import java.util.Scanner;

public class Product {
    public static int product(int n1 , int n2){
        int result = n1 * n2;
        return result;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int prod = product(a , b);
        System.out.println(prod);
    }
}
