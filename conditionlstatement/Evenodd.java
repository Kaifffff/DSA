package conditionlstatement;

import java.util.Scanner;

public class Evenodd {
    public static void main(String []args){
        System.out.println("Enter any number : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number%2==0){
            System.out.println("Even number ");
        }else{
            System.out.println("Odd number ");
        }
    }
}
