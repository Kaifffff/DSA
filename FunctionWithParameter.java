
import java.util.*;

public class FunctionWithParameter {

    public static int sum(int n1 , int n2){
        int result = n1 + n2;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = sum(a , b);
        System.out.println(result);

    }
}
