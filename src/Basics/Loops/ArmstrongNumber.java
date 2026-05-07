package Basics.Loops;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum=0;
        int m=n;

        while(n>0){
            int r = n%10;
            n=n/10;

            sum = sum + r*r*r;
        }
        if (sum==m){
            System.out.println("Armstrong number");
        }else{
            System.out.println("Not a Armstrong number");
        }
    }
}
