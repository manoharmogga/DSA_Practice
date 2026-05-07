package Basics.Conditional_Statements;

import java.util.Scanner;

public class MenuOperations {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("MENU");
        System.out.println("=====");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");

        System.out.println("Enter the 2 numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the Operation: ");
        String str = sc.nextLine();
        str=str.toUpperCase();

        switch (str){
            case "ADD": System.out.println("Sum of 2 numbers: " + (x+y));
                break;
            case "SUB": System.out.println("Subtraction of 2 numbers: " + (x-y));
                break;
            case "MUL": System.out.println("Multiplication of 2 numbers: " + (x*y));
                break;
            case "DIV": System.out.println("Division of 2 numbers: " + (x/y));
                break;
            default: System.out.println("Invalid option");
                break;
        }

    }
}
