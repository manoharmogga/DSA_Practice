package Basics;

import java.util.Scanner;

public class InputScanner2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name ypu want to wish: ");
        String name = sc.nextLine();
        System.out.println("Welcome Mr./Mrs. : "+ name);
    }
}
