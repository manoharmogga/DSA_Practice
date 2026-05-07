package Basics.Conditional_Statements;

import java.util.Scanner;

public class YoungOrNot {
    public static void main(String[] args){
        System.out.println("Enter the age of the person: ");
        Scanner sc= new Scanner(System.in);
        int age = sc.nextInt();

        if(age>=14 && age<=55){
            System.out.println("Young");
        }else{
            System.out.println("Not young");
        }
    }
}
