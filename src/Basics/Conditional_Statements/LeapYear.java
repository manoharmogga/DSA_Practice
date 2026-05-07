package Basics.Conditional_Statements;

import java.util.Scanner;

public class LeapYear {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num%4==0){
            if(num%100==0){
                if(num%400 ==0){
                    System.out.println("It's a leap year");
                }else{
                    System.out.println("It's not a leap year");
                }
            }else{
                System.out.println("It's not a leap year");
            }
        }else{
            System.out.println("It's not a leap year");
        }
    }
}
