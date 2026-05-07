package Basics.Conditional_Statements;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args){
        System.out.println("Enter the values of the A: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num %2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
