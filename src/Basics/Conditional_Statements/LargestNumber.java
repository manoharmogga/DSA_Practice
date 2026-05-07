package Basics.Conditional_Statements;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args){
        System.out.println("Enter the values of A, B, C: ");
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        if(a>b && a>c) {
            System.out.println(a);
        }
        else if(b>c){
            System.out.println(b);
        }else{
            System.out.println(c);
        }
    }
}
