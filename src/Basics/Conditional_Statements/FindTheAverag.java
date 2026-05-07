package Basics.Conditional_Statements;

import java.util.Scanner;

public class FindTheAverag {
    public static void main(String[] args){
        System.out.println("Enter the three subject marks: ");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum = a+b+c;
        int avg = sum/2;

        if (avg>=70){
            System.out.println("Grade is A");
        } else if (avg >=60 && avg<70) {
            System.out.println("Grade is B");
        } else if (avg >=50 && avg<60) {
            System.out.println("Grade is C");
        } else if (avg >=40 && avg <50) {
            System.out.println("Grade is D");
        } else{
            System.out.println("Grade is F");
        }
    }
}
